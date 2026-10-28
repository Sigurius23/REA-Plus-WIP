package io.getstream.chat.android.p226ui.feature.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c93.InterfaceC4339a;
import io.getstream.chat.android.core.utils.Debouncer;
import io.getstream.chat.android.p226ui.databinding.StreamUiSearchViewBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.EditTextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import l83.C23454a0;
import p032bc.AbstractC2938a0;
import p032bc.C2951h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 :2\u00020\u0001:\u0003:;<B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u001a\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "", "text", "updateClearButtonVisibility", "(Ljava/lang/CharSequence;)V", "Lkotlin/Function0;", "actions", "withoutListenerNotifications", "(Lc93/a;)V", "onDetachedFromWindow", "()V", "", "query", "setQuery", "(Ljava/lang/String;)V", "", "clear", "()Z", "Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;", "inputChangedListener", "setContinuousInputChangedListener", "(Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;)V", "setDebouncedInputChangedListener", "Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;", "searchStartedListener", "setSearchStartedListener", "(Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;", "debouncedInputChangedListener", "Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;", "continuousInputChangedListener", "Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;", "Lio/getstream/chat/android/core/utils/Debouncer;", "inputDebouncer", "Lio/getstream/chat/android/core/utils/Debouncer;", "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;", "disableListeners", "Z", "getQuery", "()Ljava/lang/String;", "Companion", "InputChangedListener", "SearchStartedListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SearchInputView extends FrameLayout {
    private static final Companion Companion = new Companion();
    private static final long FADE_DURATION = 300;
    private static final long TYPING_DEBOUNCE_MS = 300;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74822w = 0;
    private final StreamUiSearchViewBinding binding;
    private InputChangedListener continuousInputChangedListener;
    private InputChangedListener debouncedInputChangedListener;
    private boolean disableListeners;
    private final Debouncer inputDebouncer;
    private SearchStartedListener searchStartedListener;
    private SearchInputViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputView$Companion;", "", "<init>", "()V", "TYPING_DEBOUNCE_MS", "", "FADE_DURATION", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;", "", "", "query", "Ll83/a0;", "onInputChanged", "(Ljava/lang/String;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface InputChangedListener {
        void onInputChanged(String query);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;", "", "", "query", "Ll83/a0;", "onSearchStarted", "(Ljava/lang/String;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface SearchStartedListener {
        void onSearchStarted(String query);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInputView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiSearchViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        this.inputDebouncer = new Debouncer(300L, null, 2, null);
        init(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getQuery() {
        Editable text = this.binding.inputField.getText();
        AbstractC22676k.m65749i(text, "getText(...)");
        return AbstractC39414r.m125869O0(text).toString();
    }

    private final void init(AttributeSet attrs) {
        SearchInputViewStyle.Companion companion = SearchInputViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.style = companion.invoke(context, attrs);
        final int i13 = 0;
        this.binding.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.search.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SearchInputView f74824x;

            {
                this.f74824x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                SearchInputView searchInputView = this.f74824x;
                switch (i14) {
                    case 0:
                        SearchInputView.init$lambda$0(searchInputView, view);
                        break;
                    default:
                        int i15 = SearchInputView.f74822w;
                        searchInputView.clear();
                        break;
                }
            }
        });
        ConstraintLayout root = this.binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        SearchInputViewStyle searchInputViewStyle = this.style;
        if (searchInputViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        layoutParams.height = searchInputViewStyle.getSearchInputHeight();
        root.setLayoutParams(layoutParams);
        ImageView imageView = this.binding.clearInputButton;
        SearchInputViewStyle searchInputViewStyle2 = this.style;
        if (searchInputViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView.setImageDrawable(searchInputViewStyle2.getClearInputDrawable());
        ImageView imageView2 = this.binding.searchIcon;
        SearchInputViewStyle searchInputViewStyle3 = this.style;
        if (searchInputViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView2.setImageDrawable(searchInputViewStyle3.getSearchIconDrawable());
        ImageView searchIcon = this.binding.searchIcon;
        AbstractC22676k.m65749i(searchIcon, "searchIcon");
        ViewGroup.LayoutParams layoutParams2 = searchIcon.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        SearchInputViewStyle searchInputViewStyle4 = this.style;
        if (searchInputViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams.width = searchInputViewStyle4.getSearchIconWidth();
        SearchInputViewStyle searchInputViewStyle5 = this.style;
        if (searchInputViewStyle5 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams.height = searchInputViewStyle5.getSearchIconHeight();
        SearchInputViewStyle searchInputViewStyle6 = this.style;
        if (searchInputViewStyle6 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams.setMarginStart(searchInputViewStyle6.getSearchIconMarginStart());
        searchIcon.setLayoutParams(marginLayoutParams);
        ImageView clearInputButton = this.binding.clearInputButton;
        AbstractC22676k.m65749i(clearInputButton, "clearInputButton");
        ViewGroup.LayoutParams layoutParams3 = clearInputButton.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        SearchInputViewStyle searchInputViewStyle7 = this.style;
        if (searchInputViewStyle7 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams2.width = searchInputViewStyle7.getClearIconWidth();
        SearchInputViewStyle searchInputViewStyle8 = this.style;
        if (searchInputViewStyle8 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams2.height = searchInputViewStyle8.getClearIconHeight();
        SearchInputViewStyle searchInputViewStyle9 = this.style;
        if (searchInputViewStyle9 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams2.setMarginEnd(searchInputViewStyle9.getClearIconMarginEnd());
        clearInputButton.setLayoutParams(marginLayoutParams2);
        EditText editText = this.binding.inputField;
        SearchInputViewStyle searchInputViewStyle10 = this.style;
        if (searchInputViewStyle10 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        editText.setHint(searchInputViewStyle10.getHintText());
        EditText editText2 = this.binding.inputField;
        SearchInputViewStyle searchInputViewStyle11 = this.style;
        if (searchInputViewStyle11 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        editText2.setHintTextColor(searchInputViewStyle11.getHintColor());
        EditText editText3 = this.binding.inputField;
        SearchInputViewStyle searchInputViewStyle12 = this.style;
        if (searchInputViewStyle12 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        editText3.setTextColor(searchInputViewStyle12.getTextColor());
        SearchInputViewStyle searchInputViewStyle13 = this.style;
        if (searchInputViewStyle13 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        Drawable backgroundDrawable = searchInputViewStyle13.getBackgroundDrawable();
        SearchInputViewStyle searchInputViewStyle14 = this.style;
        if (searchInputViewStyle14 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        SearchInputViewStyle.DrawableOutline backgroundDrawableOutline = searchInputViewStyle14.getBackgroundDrawableOutline();
        if ((backgroundDrawable instanceof GradientDrawable) && backgroundDrawableOutline != null) {
            ((GradientDrawable) backgroundDrawable).setStroke(backgroundDrawableOutline.getWidth(), backgroundDrawableOutline.getColor());
        }
        ConstraintLayout root2 = this.binding.getRoot();
        SearchInputViewStyle searchInputViewStyle15 = this.style;
        if (searchInputViewStyle15 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        root2.setBackground(searchInputViewStyle15.getBackgroundDrawable());
        EditText inputField = this.binding.inputField;
        AbstractC22676k.m65749i(inputField, "inputField");
        SearchInputViewStyle searchInputViewStyle16 = this.style;
        if (searchInputViewStyle16 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextViewKt.setTextSizePx(inputField, searchInputViewStyle16.getTextSize());
        EditText inputField2 = this.binding.inputField;
        AbstractC22676k.m65749i(inputField2, "inputField");
        ViewGroup.LayoutParams layoutParams4 = inputField2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
        SearchInputViewStyle searchInputViewStyle17 = this.style;
        if (searchInputViewStyle17 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams3.setMarginStart(searchInputViewStyle17.getTextMarginStart());
        SearchInputViewStyle searchInputViewStyle18 = this.style;
        if (searchInputViewStyle18 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        marginLayoutParams3.setMarginEnd(searchInputViewStyle18.getTextMarginEnd());
        inputField2.setLayoutParams(marginLayoutParams3);
        EditText inputField3 = this.binding.inputField;
        AbstractC22676k.m65749i(inputField3, "inputField");
        inputField3.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.search.SearchInputView$init$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                this.this$0.updateClearButtonVisibility(s13);
                if (this.this$0.disableListeners) {
                    return;
                }
                final String query = this.this$0.getQuery();
                SearchInputView.InputChangedListener inputChangedListener = this.this$0.continuousInputChangedListener;
                if (inputChangedListener != null) {
                    inputChangedListener.onInputChanged(query);
                }
                Debouncer debouncer = this.this$0.inputDebouncer;
                final SearchInputView searchInputView = this.this$0;
                debouncer.submit(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.search.SearchInputView$init$7$1
                    @Override // c93.InterfaceC4339a
                    public final /* bridge */ /* synthetic */ Object invoke() {
                        m134231invoke();
                        return C23454a0.f92919a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m134231invoke() {
                        SearchInputView.InputChangedListener inputChangedListener2 = searchInputView.debouncedInputChangedListener;
                        if (inputChangedListener2 != null) {
                            inputChangedListener2.onInputChanged(query);
                        }
                    }
                });
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        this.binding.inputField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: io.getstream.chat.android.ui.feature.search.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                return SearchInputView.init$lambda$7(this.f74825a, textView, i14, keyEvent);
            }
        });
        final int i14 = 1;
        this.binding.clearInputButton.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.search.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SearchInputView f74824x;

            {
                this.f74824x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                SearchInputView searchInputView = this.f74824x;
                switch (i15) {
                    case 0:
                        SearchInputView.init$lambda$0(searchInputView, view);
                        break;
                    default:
                        int i16 = SearchInputView.f74822w;
                        searchInputView.clear();
                        break;
                }
            }
        });
        updateClearButtonVisibility(getQuery());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(SearchInputView searchInputView, View view) {
        EditText inputField = searchInputView.binding.inputField;
        AbstractC22676k.m65749i(inputField, "inputField");
        EditTextKt.focusAndShowKeyboard(inputField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$7(SearchInputView searchInputView, TextView textView, int i13, KeyEvent keyEvent) {
        if (i13 != 3) {
            return false;
        }
        SearchStartedListener searchStartedListener = searchInputView.searchStartedListener;
        if (searchStartedListener == null) {
            return true;
        }
        searchStartedListener.onSearchStarted(searchInputView.getQuery());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateClearButtonVisibility(CharSequence text) {
        boolean z4 = text == null || text.length() == 0;
        if (!z4) {
            ImageView clearInputButton = this.binding.clearInputButton;
            AbstractC22676k.m65749i(clearInputButton, "clearInputButton");
            if (clearInputButton.getVisibility() != 0) {
                ConstraintLayout root = this.binding.getRoot();
                C2951h c2951h = new C2951h((Object) null);
                c2951h.f11935y = 300L;
                AbstractC2938a0.m8568a(root, c2951h);
            }
        }
        ImageView clearInputButton2 = this.binding.clearInputButton;
        AbstractC22676k.m65749i(clearInputButton2, "clearInputButton");
        clearInputButton2.setVisibility(z4 ? 8 : 0);
    }

    private final void withoutListenerNotifications(InterfaceC4339a actions) {
        this.disableListeners = true;
        actions.invoke();
        this.disableListeners = false;
    }

    public final boolean clear() {
        if (getQuery().length() == 0) {
            return false;
        }
        this.disableListeners = true;
        this.binding.inputField.setText("");
        InputChangedListener inputChangedListener = this.continuousInputChangedListener;
        if (inputChangedListener != null) {
            inputChangedListener.onInputChanged("");
        }
        InputChangedListener inputChangedListener2 = this.debouncedInputChangedListener;
        if (inputChangedListener2 != null) {
            inputChangedListener2.onInputChanged("");
        }
        this.disableListeners = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.inputDebouncer.shutdown();
    }

    public final void setContinuousInputChangedListener(InputChangedListener inputChangedListener) {
        this.continuousInputChangedListener = inputChangedListener;
    }

    public final void setDebouncedInputChangedListener(InputChangedListener inputChangedListener) {
        this.debouncedInputChangedListener = inputChangedListener;
    }

    public final void setQuery(String query) {
        AbstractC22676k.m65750j(query, "query");
        this.binding.inputField.setText(AbstractC39414r.m125869O0(query).toString());
    }

    public final void setSearchStartedListener(SearchStartedListener searchStartedListener) {
        this.searchStartedListener = searchStartedListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInputView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiSearchViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        this.inputDebouncer = new Debouncer(300L, null, 2, null);
        init(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInputView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiSearchViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        this.inputDebouncer = new Debouncer(300L, null, 2, null);
        init(attributeSet);
    }
}
