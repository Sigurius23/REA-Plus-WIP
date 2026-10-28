package ub1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.emoji.EmojiModel;
import com.whoop.design.models.items.emoji.EmojiSize;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import u71.C34569c;
import uy0.C35375b;

/* JADX INFO: renamed from: ub1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/emoji/EmojiSize;", "Ly3/f;", "f", "(Lcom/whoop/design/models/items/emoji/EmojiSize;)F", "g", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "emojiMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34741a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f146386a = Function1.m68251a(new C34569c(6));

    /* JADX INFO: renamed from: ub1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f146387a;

        static {
            int[] iArr = new int[EmojiSize.values().length];
            try {
                iArr[EmojiSize.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmojiSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmojiSize.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmojiSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EmojiSize.EXTRA_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f146387a = iArr;
        }
    }

    /* JADX INFO: renamed from: ub1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f146388w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f146388w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f146388w.invoke((EmojiModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m109734c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(EmojiModel.class), new b(new C34569c(7)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C35375b m109735d(EmojiModel model) {
        AbstractC22676k.m65750j(model, "model");
        EmojiSize size = model.getSize();
        if (size == null) {
            size = EmojiSize.MEDIUM;
        }
        return new C35375b(model.getId(), model.getGlyph(), m109737f(size), m109738g(size), null);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m109736e() {
        return f146386a;
    }

    /* JADX INFO: renamed from: f */
    private static final float m109737f(EmojiSize emojiSize) {
        int i13 = a.f146387a[emojiSize.ordinal()];
        if (i13 == 1) {
            return 2 * 4;
        }
        if (i13 == 2) {
            return 3 * 4;
        }
        if (i13 == 3) {
            float f13 = 4;
            return f13 * f13;
        }
        if (i13 == 4) {
            return 6 * 4;
        }
        if (i13 == 5) {
            return 8 * 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private static final float m109738g(EmojiSize emojiSize) {
        int i13 = a.f146387a[emojiSize.ordinal()];
        if (i13 == 1) {
            return 6.5f;
        }
        if (i13 == 2) {
            return 9.5f;
        }
        if (i13 == 3) {
            return 13.0f;
        }
        if (i13 == 4) {
            return 20.25f;
        }
        if (i13 == 5) {
            return 25.25f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
