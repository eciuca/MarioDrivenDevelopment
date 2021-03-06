package com.wibowo.intellij.mdd;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.openapi.project.DumbAware;

public class ToggleBackgroundMusic extends ToggleAction implements DumbAware {
	@Override public boolean isSelected(AnActionEvent anActionEvent) {
		return Settings.getInstance().backgroundMusicEnabled;
	}

	@Override public void setSelected(AnActionEvent anActionEvent, boolean value) {
		MarioProjectListenerComponent.instance().setBackgroundMusicEnabled(value);
	}
}
