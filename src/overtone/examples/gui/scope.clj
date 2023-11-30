(ns overtone.examples.gui.scope
  (:use overtone.live
        overtone.inst.synth
        overtone.gui.scope))

(pscope)

(demo 10 (sin-osc 200))

;;(rise-fall-pad 660)

#_(spectrogram 0)
