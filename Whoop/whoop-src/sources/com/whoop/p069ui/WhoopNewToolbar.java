package com.whoop.p069ui;

import a61.C0468a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import as2.AbstractC1953c;
import az1.C2161b;
import c93.InterfaceC4339a;
import com.whoop.p069ui.views.ColoredImageView;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import nf1.AbstractC26661b;
import nf1.AbstractC26662c;
import nf1.AbstractC26663d;
import nf1.AbstractC26666g;
import nf1.AbstractC26667h;
import of1.C27896b;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0015J!\u0010$\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0&¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0012¢\u0006\u0004\b*\u0010\u0015J\u001b\u0010+\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0&¢\u0006\u0004\b+\u0010(J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0012¢\u0006\u0004\b/\u0010\u0015J\u0019\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\fJ\u0019\u00106\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\fJ\u0019\u00107\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\fJ\u0017\u00108\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b8\u0010\u0015J\u0017\u00109\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b9\u0010\u0015J\u0019\u0010:\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\fR\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m65681d2 = {"Lcom/whoop/ui/WhoopNewToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "resourceId", "Ll83/a0;", "setBackArrowResource", "(I)V", "", "data", "textColor", "t", "(Ljava/lang/String;I)V", "", "enable", "setToolbarDataVisibility", "(Z)V", "title", "setToolbarTitle", "setToolbarTitleText", "(Ljava/lang/String;)V", "setToolbarSubjectTitle", "setToolbarSubjectTitleByValue", "subTitle", "setToolbarSubjectSubTitle", "setSubjectImageDrawable", "setOptionItemImageDrawable", "setOptionItemImageDrawableVisibility", "Lkotlin/Function1;", "Landroid/view/View;", "onClick", "n", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "r", "(Lc93/a;)V", "show", "setSubjectImageDrawableVisibility", "p", "l", "()V", "shouldGlow", "setGlowingIconEffect", "Landroid/content/res/TypedArray;", "arr", "m", "(Landroid/content/res/TypedArray;)V", "setToolbarTitleColor", "color", "setToolbarSubjectTitleColor", "setToolbarSubjectSubTitleColor", "setSubjectContainerVisibility", "setHelpButtonVisibility", "setToolbarBackgroundColor", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "toolbarTitleColor", "x", "toolbarSubjectTitleColor", "y", "toolbarSubjectSubTitleColor", "z", "toolbarBackgroundColor", "Lof1/b;", "E", "Lof1/b;", "binding", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopNewToolbar extends ConstraintLayout {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private C27896b binding;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int toolbarTitleColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int toolbarSubjectTitleColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int toolbarSubjectSubTitleColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int toolbarBackgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhoopNewToolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        this.toolbarTitleColor = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156006O);
        this.toolbarSubjectTitleColor = AbstractC32122c.getColor(getContext(), AbstractC26661b.f105978d);
        this.toolbarSubjectSubTitleColor = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156028g);
        this.toolbarBackgroundColor = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156005N);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC26667h.f106028h);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m26681m(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    private final void m26681m(TypedArray arr) {
        C27896b c27896bM84177c = C27896b.m84177c(LayoutInflater.from(getContext()), this, true);
        AbstractC22676k.m65749i(c27896bM84177c, "inflate(...)");
        this.binding = c27896bM84177c;
        if (arr != null) {
            if (arr.hasValue(AbstractC26667h.f106031k)) {
                setOptionItemImageDrawable(arr.getResourceId(AbstractC26667h.f106031k, 0));
            }
            setOptionItemImageDrawableVisibility(arr.getBoolean(AbstractC26667h.f106032l, false));
            if (arr.hasValue(AbstractC26667h.f106036p)) {
                setSubjectImageDrawable(arr.getResourceId(AbstractC26667h.f106036p, 0));
            }
            if (arr.hasValue(AbstractC26667h.f106040t)) {
                setToolbarTitle(arr.getResourceId(AbstractC26667h.f106040t, 0));
                setToolbarTitleColor(arr.getColor(AbstractC26667h.f106041u, this.toolbarTitleColor));
            } else if (arr.hasValue(AbstractC26667h.f106041u)) {
                setToolbarTitleColor(arr.getColor(AbstractC26667h.f106041u, this.toolbarTitleColor));
            }
            setSubjectContainerVisibility(arr.getBoolean(AbstractC26667h.f106035o, false));
            if (arr.hasValue(AbstractC26667h.f106035o)) {
                setToolbarSubjectTitle(arr.getResourceId(AbstractC26667h.f106038r, 0));
                setToolbarSubjectTitleColor(arr.getColor(AbstractC26667h.f106039s, this.toolbarSubjectTitleColor));
                setToolbarSubjectSubTitleColor(arr.getColor(AbstractC26667h.f106037q, this.toolbarSubjectSubTitleColor));
            }
            if (arr.hasValue(AbstractC26667h.f106034n)) {
                String string = getContext().getString(AbstractC26666g.f106015f);
                AbstractC22676k.m65749i(string, "getString(...)");
                m26685u(this, string, 0, 2, null);
            }
            setHelpButtonVisibility(arr.getBoolean(AbstractC26667h.f106030j, false));
            if (arr.hasValue(AbstractC26667h.f106033m)) {
                setToolbarBackgroundColor(arr.getColor(AbstractC26667h.f106033m, this.toolbarBackgroundColor));
            }
            if (arr.hasValue(AbstractC26667h.f106029i)) {
                setBackArrowResource(arr.getResourceId(AbstractC26667h.f106029i, AbstractC26662c.f105981c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m26682o(Function1 function1, View it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m26683q(InterfaceC4339a interfaceC4339a, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m26684s(InterfaceC4339a interfaceC4339a, View it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    private final void setHelpButtonVisibility(boolean enable) {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView helpButton = c27896b.f112481d;
        AbstractC22676k.m65749i(helpButton, "helpButton");
        helpButton.setVisibility(enable ? 0 : 8);
    }

    private final void setSubjectContainerVisibility(boolean enable) {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout titleSubjectLayout = c27896b.f112487j;
        AbstractC22676k.m65749i(titleSubjectLayout, "titleSubjectLayout");
        titleSubjectLayout.setVisibility(enable ? 0 : 8);
        C27896b c27896b2 = this.binding;
        if (c27896b2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView mainTitleTv = c27896b2.f112482e;
        AbstractC22676k.m65749i(mainTitleTv, "mainTitleTv");
        mainTitleTv.setVisibility(enable ? 8 : 0);
    }

    private final void setToolbarBackgroundColor(int color) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112488k.setBackgroundColor(color);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    private final void setToolbarSubjectSubTitleColor(int color) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112484g.setTextColor(color);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    private final void setToolbarSubjectTitleColor(int color) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112485h.setTextColor(color);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    private final void setToolbarTitleColor(int textColor) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112482e.setTextColor(textColor);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m26685u(WhoopNewToolbar whoopNewToolbar, String str, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = whoopNewToolbar.toolbarTitleColor;
        }
        whoopNewToolbar.m26690t(str, i13);
    }

    /* JADX INFO: renamed from: l */
    public final void m26686l() {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView dataTv = c27896b.f112480c;
        AbstractC22676k.m65749i(dataTv, "dataTv");
        dataTv.setVisibility(8);
        C27896b c27896b2 = this.binding;
        if (c27896b2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView helpButton = c27896b2.f112481d;
        AbstractC22676k.m65749i(helpButton, "helpButton");
        helpButton.setVisibility(8);
        C1153p c1153p = new C1153p();
        C27896b c27896b3 = this.binding;
        if (c27896b3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c1153p.m3648e(c27896b3.f112488k);
        c1153p.m3650g(AbstractC26663d.f105990i, 6, AbstractC26663d.f105994m, 6, 0);
        c1153p.m3650g(AbstractC26663d.f105990i, 7, AbstractC26663d.f105994m, 7, 0);
        C27896b c27896b4 = this.binding;
        if (c27896b4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c1153p.m3644a(c27896b4.f112488k);
        C27896b c27896b5 = this.binding;
        if (c27896b5 != null) {
            c27896b5.f112482e.setGravity(17);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m26687n(Function1 onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView backIv = c27896b.f112479b;
        AbstractC22676k.m65749i(backIv, "backIv");
        AbstractC1953c.m5963a(backIv, new C0468a(onClick, 24));
    }

    /* JADX INFO: renamed from: p */
    public final void m26688p(InterfaceC4339a onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView helpButton = c27896b.f112481d;
        AbstractC22676k.m65749i(helpButton, "helpButton");
        AbstractC1953c.m5963a(helpButton, new C2161b(onClick, 10));
    }

    /* JADX INFO: renamed from: r */
    public final void m26689r(InterfaceC4339a onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView optionIv = c27896b.f112483f;
        AbstractC22676k.m65749i(optionIv, "optionIv");
        AbstractC1953c.m5963a(optionIv, new C2161b(onClick, 11));
    }

    public final void setBackArrowResource(int resourceId) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112479b.setImageResource(resourceId);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setGlowingIconEffect(boolean shouldGlow) {
        if (shouldGlow) {
            C27896b c27896b = this.binding;
            if (c27896b != null) {
                c27896b.f112483f.setBackgroundResource(AbstractC26662c.f105980b);
                return;
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
        C27896b c27896b2 = this.binding;
        if (c27896b2 != null) {
            c27896b2.f112483f.setBackground(null);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setOptionItemImageDrawable(int resourceId) {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c27896b.f112483f.setVisibility(0);
        C27896b c27896b2 = this.binding;
        if (c27896b2 != null) {
            c27896b2.f112483f.setImageResource(resourceId);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setOptionItemImageDrawableVisibility(boolean enable) {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView optionIv = c27896b.f112483f;
        AbstractC22676k.m65749i(optionIv, "optionIv");
        optionIv.setVisibility(enable ? 0 : 8);
    }

    public final void setSubjectImageDrawable(int resourceId) {
        setSubjectImageDrawableVisibility(true);
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112489l.setImageResource(resourceId);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setSubjectImageDrawableVisibility(boolean show) {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ColoredImageView toolbarSubjectIv = c27896b.f112489l;
        AbstractC22676k.m65749i(toolbarSubjectIv, "toolbarSubjectIv");
        toolbarSubjectIv.setVisibility(show ? 0 : 8);
    }

    public final void setToolbarDataVisibility(boolean enable) {
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView dataTv = c27896b.f112480c;
        AbstractC22676k.m65749i(dataTv, "dataTv");
        dataTv.setVisibility(enable ? 0 : 8);
    }

    public final void setToolbarSubjectSubTitle(String subTitle) {
        AbstractC22676k.m65750j(subTitle, "subTitle");
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112484g.setText(subTitle);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setToolbarSubjectTitle(int title) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112485h.setText(getContext().getString(title));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setToolbarSubjectTitleByValue(String title) {
        AbstractC22676k.m65750j(title, "title");
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112485h.setText(title);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setToolbarTitle(int title) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112482e.setText(getContext().getString(title));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    public final void setToolbarTitleText(String title) {
        C27896b c27896b = this.binding;
        if (c27896b != null) {
            c27896b.f112482e.setText(title);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m26690t(String data, int textColor) {
        AbstractC22676k.m65750j(data, "data");
        C27896b c27896b = this.binding;
        if (c27896b == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c27896b.f112480c.setVisibility(0);
        C27896b c27896b2 = this.binding;
        if (c27896b2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c27896b2.f112480c.setText(data);
        C27896b c27896b3 = this.binding;
        if (c27896b3 != null) {
            c27896b3.f112480c.setTextColor(textColor);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }
}
