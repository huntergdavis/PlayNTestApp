package com.huntergdavis.NoteWar.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.huntergdavis.NoteWar.core.NoteWar;

public class NoteWarHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assets().setPathPrefix("notewar/");
    PlayN.run(new NoteWar());
  }
}
