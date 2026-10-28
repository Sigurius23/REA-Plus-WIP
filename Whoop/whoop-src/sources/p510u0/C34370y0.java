package p510u0;

import android.view.KeyEvent;
import p477s2.AbstractC32070b;
import p477s2.AbstractC32073e;
import p477s2.AbstractC32076h;
import p508ty.C34249c;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: u0.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34370y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144440a;

    public /* synthetic */ C34370y0(int i13) {
        this.f144440a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C34311e m108670a(int i13, long j7, long j13) {
        if ((i13 & 1) != 0) {
            j7 = AbstractC34301a1.f144048a;
        }
        long j14 = j7;
        if ((i13 & 2) != 0) {
            j13 = AbstractC34301a1.f144049b;
        }
        return new C34311e(j14, j13, AbstractC35745c.m113245g(0.25d));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX INFO: renamed from: b */
    public EnumC34330k0 m108671b(KeyEvent keyEvent) {
        EnumC34330k0 enumC34330k0;
        EnumC34330k0 enumC34330k1 = null;
        switch (this.f144440a) {
            case 1:
                int i13 = C34333l0.f144209w;
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    if (AbstractC32070b.m99689a(AbstractC32076h.m99769b(keyEvent.getKeyCode()), AbstractC34366w0.f144391g)) {
                        return EnumC34330k0.REDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    long jM99714D = AbstractC32073e.m99714D(keyEvent);
                    if (AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144386b) || AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144402r)) {
                        return EnumC34330k0.COPY;
                    }
                    if (AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144388d)) {
                        return EnumC34330k0.PASTE;
                    }
                    if (AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144390f)) {
                        return EnumC34330k0.CUT;
                    }
                    if (AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144385a)) {
                        return EnumC34330k0.SELECT_ALL;
                    }
                    if (AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144389e)) {
                        return EnumC34330k0.REDO;
                    }
                    if (AbstractC32070b.m99689a(jM99714D, AbstractC34366w0.f144391g)) {
                        return EnumC34330k0.UNDO;
                    }
                    return null;
                }
                if (keyEvent.isCtrlPressed()) {
                    return null;
                }
                if (keyEvent.isShiftPressed()) {
                    long jM99769b = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144393i)) {
                        return EnumC34330k0.SELECT_LEFT_CHAR;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144394j)) {
                        return EnumC34330k0.SELECT_RIGHT_CHAR;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144395k)) {
                        return EnumC34330k0.SELECT_UP;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144396l)) {
                        return EnumC34330k0.SELECT_DOWN;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144398n)) {
                        return EnumC34330k0.SELECT_PAGE_UP;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144399o)) {
                        return EnumC34330k0.SELECT_PAGE_DOWN;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144400p)) {
                        return EnumC34330k0.SELECT_LINE_START;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144401q)) {
                        return EnumC34330k0.SELECT_LINE_END;
                    }
                    if (AbstractC32070b.m99689a(jM99769b, AbstractC34366w0.f144402r)) {
                        return EnumC34330k0.PASTE;
                    }
                    return null;
                }
                long jM99769b2 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144393i)) {
                    return EnumC34330k0.LEFT_CHAR;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144394j)) {
                    return EnumC34330k0.RIGHT_CHAR;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144395k)) {
                    return EnumC34330k0.UP;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144396l)) {
                    return EnumC34330k0.DOWN;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144397m)) {
                    return EnumC34330k0.CENTER;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144398n)) {
                    return EnumC34330k0.PAGE_UP;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144399o)) {
                    return EnumC34330k0.PAGE_DOWN;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144400p)) {
                    return EnumC34330k0.LINE_START;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144401q)) {
                    return EnumC34330k0.LINE_END;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144403s) || AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144404t)) {
                    return EnumC34330k0.NEW_LINE;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144405u)) {
                    return EnumC34330k0.DELETE_PREV_CHAR;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144406v)) {
                    return EnumC34330k0.DELETE_NEXT_CHAR;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144407w)) {
                    return EnumC34330k0.PASTE;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144408x)) {
                    return EnumC34330k0.CUT;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144409y)) {
                    return EnumC34330k0.COPY;
                }
                if (AbstractC32070b.m99689a(jM99769b2, AbstractC34366w0.f144410z)) {
                    return EnumC34330k0.TAB;
                }
                return null;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long jM99769b3 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b3, AbstractC34366w0.f144393i)) {
                        enumC34330k0 = EnumC34330k0.SELECT_LINE_LEFT;
                    } else if (AbstractC32070b.m99689a(jM99769b3, AbstractC34366w0.f144394j)) {
                        enumC34330k0 = EnumC34330k0.SELECT_LINE_RIGHT;
                    } else if (AbstractC32070b.m99689a(jM99769b3, AbstractC34366w0.f144395k)) {
                        enumC34330k0 = EnumC34330k0.SELECT_HOME;
                    } else if (AbstractC32070b.m99689a(jM99769b3, AbstractC34366w0.f144396l)) {
                        enumC34330k0 = EnumC34330k0.SELECT_END;
                    } else {
                        enumC34330k0 = null;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jM99769b4 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b4, AbstractC34366w0.f144393i)) {
                        enumC34330k0 = EnumC34330k0.LINE_LEFT;
                    } else if (AbstractC32070b.m99689a(jM99769b4, AbstractC34366w0.f144394j)) {
                        enumC34330k0 = EnumC34330k0.LINE_RIGHT;
                    } else if (AbstractC32070b.m99689a(jM99769b4, AbstractC34366w0.f144395k)) {
                        enumC34330k0 = EnumC34330k0.HOME;
                    } else if (AbstractC32070b.m99689a(jM99769b4, AbstractC34366w0.f144396l)) {
                        enumC34330k0 = EnumC34330k0.END;
                    } else {
                        enumC34330k0 = null;
                    }
                } else {
                    enumC34330k0 = null;
                }
                if (enumC34330k0 != null) {
                    return enumC34330k0;
                }
                C34249c c34249c = AbstractC34336m0.f144229a;
                c34249c.getClass();
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long jM99769b5 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b5, AbstractC34366w0.f144393i)) {
                        enumC34330k1 = EnumC34330k0.SELECT_LEFT_WORD;
                    } else if (AbstractC32070b.m99689a(jM99769b5, AbstractC34366w0.f144394j)) {
                        enumC34330k1 = EnumC34330k0.SELECT_RIGHT_WORD;
                    } else if (AbstractC32070b.m99689a(jM99769b5, AbstractC34366w0.f144395k)) {
                        enumC34330k1 = EnumC34330k0.SELECT_PREV_PARAGRAPH;
                    } else if (AbstractC32070b.m99689a(jM99769b5, AbstractC34366w0.f144396l)) {
                        enumC34330k1 = EnumC34330k0.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long jM99769b6 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144393i)) {
                        enumC34330k1 = EnumC34330k0.LEFT_WORD;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144394j)) {
                        enumC34330k1 = EnumC34330k0.RIGHT_WORD;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144395k)) {
                        enumC34330k1 = EnumC34330k0.PREV_PARAGRAPH;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144396l)) {
                        enumC34330k1 = EnumC34330k0.NEXT_PARAGRAPH;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144387c)) {
                        enumC34330k1 = EnumC34330k0.DELETE_PREV_CHAR;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144406v)) {
                        enumC34330k1 = EnumC34330k0.DELETE_NEXT_WORD;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144405u)) {
                        enumC34330k1 = EnumC34330k0.DELETE_PREV_WORD;
                    } else if (AbstractC32070b.m99689a(jM99769b6, AbstractC34366w0.f144392h)) {
                        enumC34330k1 = EnumC34330k0.DESELECT;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long jM99769b7 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b7, AbstractC34366w0.f144400p)) {
                        enumC34330k1 = EnumC34330k0.SELECT_LINE_START;
                    } else if (AbstractC32070b.m99689a(jM99769b7, AbstractC34366w0.f144401q)) {
                        enumC34330k1 = EnumC34330k0.SELECT_LINE_END;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jM99769b8 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
                    if (AbstractC32070b.m99689a(jM99769b8, AbstractC34366w0.f144405u)) {
                        enumC34330k1 = EnumC34330k0.DELETE_FROM_LINE_START;
                    } else if (AbstractC32070b.m99689a(jM99769b8, AbstractC34366w0.f144406v)) {
                        enumC34330k1 = EnumC34330k0.DELETE_TO_LINE_END;
                    }
                }
                return enumC34330k1 == null ? ((C34370y0) c34249c.f143660x).m108671b(keyEvent) : enumC34330k1;
        }
    }
}
