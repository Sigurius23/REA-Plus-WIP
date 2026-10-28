package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1583f2;
import b30.C2665z;
import c93.InterfaceC4339a;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.whoop.android.R;
import e93.AbstractC12889b;
import j93.InterfaceC21493z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23457c;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p479s4.AbstractC32122c;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p537ux.AbstractC35333g0;
import p695zx.C41186h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import q30.C29934u0;
import r12.C30856a;
import s40.AbstractC32145e0;
import s40.C32138c;
import s40.C32162k0;
import s40.C32166m0;
import s40.C32177s;
import s40.C32179t;
import s40.EnumC32184v0;
import s40.EnumC32187x;
import s40.InterfaceC32143d1;
import s40.InterfaceC32149f1;
import s40.InterfaceC32163l;
import s40.InterfaceC32189y;
import wb3.AbstractC37056f;
import y00.C38793c;
import y00.C38809d5;
import y00.C38816e2;
import y00.C38892m;
import y00.C38951s4;
import y00.C38968u3;
import y00.C38977v3;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\"\u0010\u001eJ\u0019\u0010#\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b#\u0010\u0007J\u0015\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010\u001eJ\u0019\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b+\u0010\u001eJ\u0019\u0010.\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b1\u0010/J\u0019\u00103\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b3\u0010/J\u0019\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b5\u0010/J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b7\u0010'R\u001a\u0010=\u001a\u0002088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010C\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010U\u001a\u00020P8\u0000X\u0081\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010Z\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010i\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010c\u001a\u0004\bh\u0010eR\u001a\u0010l\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010c\u001a\u0004\bk\u0010eR\"\u0010r\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010'R+\u0010x\u001a\u00020$2\u0006\u0010s\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010p\"\u0004\bw\u0010'R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR5\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010\u001eR7\u0010\u008d\u0001\u001a\u00020$2\u0007\u0010\u0081\u0001\u001a\u00020$8\u0000@@X\u0081\u000e¢\u0006\u001d\n\u0005\b\u0088\u0001\u0010n\u0012\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u0089\u0001\u0010p\"\u0005\b\u008a\u0001\u0010'R4\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00032\b\u0010s\u001a\u0004\u0018\u00010\u00038@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b\u008e\u0001\u0010u\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010\u0007R0\u0010\u0097\u0001\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b\u0093\u0001\u0010u\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0005\b\u0096\u0001\u0010\u000bR0\u0010\u009b\u0001\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b\u0098\u0001\u0010u\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001\"\u0005\b\u009a\u0001\u0010\u000bR0\u0010\u009f\u0001\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b\u009c\u0001\u0010u\u001a\u0006\b\u009d\u0001\u0010\u0095\u0001\"\u0005\b\u009e\u0001\u0010\u000bR4\u0010£\u0001\u001a\u0004\u0018\u00010\b2\b\u0010s\u001a\u0004\u0018\u00010\b8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0005\b \u0001\u0010u\u001a\u0006\b¡\u0001\u0010\u0095\u0001\"\u0005\b¢\u0001\u0010\u000bR\u001f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030¥\u00010¤\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0014\u0010«\u0001\u001a\u00020\u00108F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\"\u0010°\u0001\u001a\u0005\u0018\u00010¬\u00018VX\u0097\u0004¢\u0006\u0010\u0012\u0006\b¯\u0001\u0010\u008c\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010´\u0001\u001a\u0005\u0018\u00010±\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u001a\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0017\u0010¼\u0001\u001a\u0005\u0018\u00010¹\u00018F¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0017\u0010À\u0001\u001a\u0005\u0018\u00010½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010Ä\u0001\u001a\u0005\u0018\u00010Á\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u001f\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010É\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001¨\u0006Î\u0001"}, m65681d2 = {"Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/LinearLayout;", "", "", "resId", "Ll83/a0;", "setExpirationDatePlaceholderRes", "(Ljava/lang/Integer;)V", "Ls40/f1;", "listener", "setCardNumberErrorListener", "(Ls40/f1;)V", "setExpirationDateErrorListener", "setCvcErrorListener", "setPostalCodeErrorListener", "", "Ly00/i;", "preferredNetworks", "setPreferredNetworks", "(Ljava/util/List;)V", "Ls40/l;", "setCardInputListener", "(Ls40/l;)V", "Ls40/y;", "callback", "setCardValidCallback", "(Ls40/y;)V", "", "cardHint", "setCardHint", "(Ljava/lang/String;)V", "cvcPlaceholderText", "setCvcPlaceholderText", "cvcLabel", "setCvcLabel", "setCvcIcon", "", "shouldShowPostalCode", "setShouldShowPostalCode", "(Z)V", "cardNumber", "setCardNumber", "cvcCode", "setCvcCode", "Landroid/text/TextWatcher;", "cardNumberTextWatcher", "setCardNumberTextWatcher", "(Landroid/text/TextWatcher;)V", "expiryDateTextWatcher", "setExpiryDateTextWatcher", "cvcNumberTextWatcher", "setCvcNumberTextWatcher", "postalCodeTextWatcher", "setPostalCodeTextWatcher", "enabled", "setEnabled", "Lcom/stripe/android/view/CardNumberEditText;", "x", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText", "()Lcom/stripe/android/view/CardNumberEditText;", "cardNumberEditText", "Lcom/stripe/android/view/CardBrandView;", "y", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "cardBrandView", "Lcom/stripe/android/view/ExpiryDateEditText;", "z", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText", "()Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateEditText", "Lcom/stripe/android/view/CvcEditText;", "E", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText", "()Lcom/stripe/android/view/CvcEditText;", "cvcEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "F", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeEditText", "G", "Landroid/widget/LinearLayout;", "getSecondRowLayout", "()Landroid/widget/LinearLayout;", "secondRowLayout", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "H", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "getCardNumberTextInputLayout", "()Lcom/stripe/android/view/CardNumberTextInputLayout;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "I", "Lcom/google/android/material/textfield/TextInputLayout;", "getExpiryTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "expiryTextInputLayout", "J", "getCvcInputLayout", "cvcInputLayout", "K", "getPostalInputLayout$payments_core_release", "postalInputLayout", "R", "Z", "getPostalCodeRequired", "()Z", "setPostalCodeRequired", "postalCodeRequired", "<set-?>", "S", "Lf93/d;", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired", "Landroidx/lifecycle/f2;", "T", "Landroidx/lifecycle/f2;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/f2;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/f2;)V", "viewModelStoreOwner", "value", "U", "Ljava/lang/String;", "getOnBehalfOf", "()Ljava/lang/String;", "setOnBehalfOf", "onBehalfOf", "V", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon$payments_core_release", "getShouldShowErrorIcon$payments_core_release$annotations", "()V", "shouldShowErrorIcon", "W", "getExpirationDatePlaceholderRes$payments_core_release", "()Ljava/lang/Integer;", "setExpirationDatePlaceholderRes$payments_core_release", "expirationDatePlaceholderRes", "b0", "getCardNumberErrorListener$payments_core_release", "()Ls40/f1;", "setCardNumberErrorListener$payments_core_release", "cardNumberErrorListener", "c0", "getExpirationDateErrorListener$payments_core_release", "setExpirationDateErrorListener$payments_core_release", "expirationDateErrorListener", "d0", "getCvcErrorListener$payments_core_release", "setCvcErrorListener$payments_core_release", "cvcErrorListener", "e0", "getPostalCodeErrorListener$payments_core_release", "setPostalCodeErrorListener$payments_core_release", "postalCodeErrorListener", "", "Ls40/x;", "getInvalidFields$payments_core_release", "()Ljava/util/Set;", "invalidFields", "getBrand", "()Ly00/i;", "brand", "Ly00/m;", "getCardParams", "()Ly00/m;", "getCardParams$annotations", "cardParams", "Ly00/s4;", "getPaymentMethodCard", "()Ly00/s4;", "paymentMethodCard", "Ly00/d5;", "getPaymentMethodCreateParams", "()Ly00/d5;", "paymentMethodCreateParams", "Ly00/v3;", "getPaymentMethodBillingDetails", "()Ly00/v3;", "paymentMethodBillingDetails", "Ly00/u3;", "getPaymentMethodBillingDetailsBuilder", "()Ly00/u3;", "paymentMethodBillingDetailsBuilder", "Lzx/h;", "getValidatedCardNumber$payments_core_release", "()Lzx/h;", "validatedCardNumber", "Ly00/e2;", "getExpirationDate", "()Ly00/e2;", "expirationDate", "", "Lcom/stripe/android/view/StripeEditText;", "getAllFields", "()Ljava/util/Collection;", "allFields", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CardMultilineWidget extends LinearLayout {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ InterfaceC21493z[] f22478f0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final CvcEditText cvcEditText;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final PostalCodeEditText postalCodeEditText;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final LinearLayout secondRowLayout;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final CardNumberTextInputLayout cardNumberTextInputLayout;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final TextInputLayout expiryTextInputLayout;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final TextInputLayout cvcInputLayout;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final TextInputLayout postalInputLayout;

    /* JADX INFO: renamed from: L */
    public final C32166m0 f22486L;

    /* JADX INFO: renamed from: M */
    public final List f22487M;

    /* JADX INFO: renamed from: N */
    public final C32177s f22488N;

    /* JADX INFO: renamed from: O */
    public boolean f22489O;

    /* JADX INFO: renamed from: P */
    public String f22490P;

    /* JADX INFO: renamed from: Q */
    public String f22491Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean postalCodeRequired;

    /* JADX INFO: renamed from: S */
    public final C32179t f22493S;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public InterfaceC1583f2 viewModelStoreOwner;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String onBehalfOf;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean shouldShowErrorIcon;

    /* JADX INFO: renamed from: W */
    public final C32179t f22497W;

    /* JADX INFO: renamed from: a0 */
    public boolean f22498a0;

    /* JADX INFO: renamed from: b0 */
    public final C32179t f22499b0;

    /* JADX INFO: renamed from: c0 */
    public final C32179t f22500c0;

    /* JADX INFO: renamed from: d0 */
    public final C32179t f22501d0;

    /* JADX INFO: renamed from: e0 */
    public final C32179t f22502e0;

    /* JADX INFO: renamed from: w */
    public boolean f22503w;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final CardNumberEditText cardNumberEditText;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final CardBrandView cardBrandView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final ExpiryDateEditText expiryDateEditText;

    static {
        C22686q c22686q = new C22686q(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f22478f0 = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0, c22673i0), AbstractC11895b.m31990i(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0, c22673i0), AbstractC11895b.m31990i(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0, c22673i0), AbstractC11895b.m31990i(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0, c22673i0), AbstractC11895b.m31990i(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0, c22673i0)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        final int i13 = 0;
        final int i14 = 1;
        this.f22503w = true;
        LayoutInflater.from(context).inflate(R.layout.stripe_card_multiline_widget, this);
        int i15 = R.id.card_brand_view;
        CardBrandView cardBrandView = (CardBrandView) AbstractC34235f.m108203J(this, R.id.card_brand_view);
        if (cardBrandView != null) {
            i15 = R.id.card_number_input_container;
            if (((FrameLayout) AbstractC34235f.m108203J(this, R.id.card_number_input_container)) != null) {
                i15 = R.id.et_card_number;
                CardNumberEditText cardNumberEditText = (CardNumberEditText) AbstractC34235f.m108203J(this, R.id.et_card_number);
                if (cardNumberEditText != null) {
                    i15 = R.id.et_cvc;
                    CvcEditText cvcEditText = (CvcEditText) AbstractC34235f.m108203J(this, R.id.et_cvc);
                    if (cvcEditText != null) {
                        i15 = R.id.et_expiry;
                        ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) AbstractC34235f.m108203J(this, R.id.et_expiry);
                        if (expiryDateEditText != null) {
                            i15 = R.id.et_postal_code;
                            PostalCodeEditText postalCodeEditText = (PostalCodeEditText) AbstractC34235f.m108203J(this, R.id.et_postal_code);
                            if (postalCodeEditText != null) {
                                i15 = R.id.second_row_layout;
                                LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(this, R.id.second_row_layout);
                                if (linearLayout != null) {
                                    i15 = R.id.tl_card_number;
                                    CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) AbstractC34235f.m108203J(this, R.id.tl_card_number);
                                    if (cardNumberTextInputLayout != null) {
                                        i15 = R.id.tl_cvc;
                                        TextInputLayout textInputLayout = (TextInputLayout) AbstractC34235f.m108203J(this, R.id.tl_cvc);
                                        if (textInputLayout != null) {
                                            i15 = R.id.tl_expiry;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) AbstractC34235f.m108203J(this, R.id.tl_expiry);
                                            if (textInputLayout2 != null) {
                                                i15 = R.id.tl_postal_code;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) AbstractC34235f.m108203J(this, R.id.tl_postal_code);
                                                if (textInputLayout3 != null) {
                                                    this.cardNumberEditText = cardNumberEditText;
                                                    this.cardBrandView = cardBrandView;
                                                    this.expiryDateEditText = expiryDateEditText;
                                                    this.cvcEditText = cvcEditText;
                                                    this.postalCodeEditText = postalCodeEditText;
                                                    this.secondRowLayout = linearLayout;
                                                    this.cardNumberTextInputLayout = cardNumberTextInputLayout;
                                                    this.expiryTextInputLayout = textInputLayout2;
                                                    this.cvcInputLayout = textInputLayout;
                                                    this.postalInputLayout = textInputLayout3;
                                                    this.f22486L = new C32166m0();
                                                    final int i16 = 2;
                                                    final int i17 = 3;
                                                    List<TextInputLayout> listM118959K = AbstractC37056f.m118959K(cardNumberTextInputLayout, textInputLayout2, textInputLayout, textInputLayout3);
                                                    this.f22487M = listM118959K;
                                                    this.f22488N = new C32177s(this, 0);
                                                    this.f22493S = new C32179t(0, this);
                                                    this.f22497W = new C32179t(1, this);
                                                    this.f22499b0 = new C32179t(new C32162k0(cardNumberTextInputLayout), this, i16);
                                                    this.f22500c0 = new C32179t(new C32162k0(textInputLayout2), this, i17);
                                                    this.f22501d0 = new C32179t(new C32162k0(textInputLayout), this, 4);
                                                    this.f22502e0 = new C32179t(new C32162k0(textInputLayout3), this, 5);
                                                    setOrientation(1);
                                                    for (TextInputLayout textInputLayout4 : listM118959K) {
                                                        EditText editText = textInputLayout4.getEditText();
                                                        textInputLayout4.setPlaceholderTextColor(editText != null ? editText.getHintTextColors() : null);
                                                    }
                                                    Context context2 = getContext();
                                                    AbstractC22676k.m65749i(context2, "getContext(...)");
                                                    TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC35333g0.f150535a, 0, 0);
                                                    this.f22503w = typedArrayObtainStyledAttributes.getBoolean(2, this.f22503w);
                                                    this.postalCodeRequired = typedArrayObtainStyledAttributes.getBoolean(0, this.postalCodeRequired);
                                                    setUsZipCodeRequired(typedArrayObtainStyledAttributes.getBoolean(1, getUsZipCodeRequired()));
                                                    typedArrayObtainStyledAttributes.recycle();
                                                    this.cardNumberEditText.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
                                                    this.expiryDateEditText.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
                                                    this.cvcEditText.setErrorMessageListener(getCvcErrorListener$payments_core_release());
                                                    this.postalCodeEditText.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
                                                    this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: s40.o
                                                        @Override // android.view.View.OnFocusChangeListener
                                                        public final void onFocusChange(View view, boolean z4) {
                                                            int i18 = i13;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    if (!z4) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    } else if (!cardMultilineWidget.f22498a0 && !cardMultilineWidget.getBrand().m124355d(cardMultilineWidget.cvcEditText.getFieldText$payments_core_release())) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    boolean z13 = cardMultilineWidget.f22503w;
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: s40.o
                                                        @Override // android.view.View.OnFocusChangeListener
                                                        public final void onFocusChange(View view, boolean z4) {
                                                            int i18 = i14;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    if (!z4) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    } else if (!cardMultilineWidget.f22498a0 && !cardMultilineWidget.getBrand().m124355d(cardMultilineWidget.cvcEditText.getFieldText$payments_core_release())) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    boolean z13 = cardMultilineWidget.f22503w;
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: s40.o
                                                        @Override // android.view.View.OnFocusChangeListener
                                                        public final void onFocusChange(View view, boolean z4) {
                                                            int i18 = i16;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    if (!z4) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    } else if (!cardMultilineWidget.f22498a0 && !cardMultilineWidget.getBrand().m124355d(cardMultilineWidget.cvcEditText.getFieldText$payments_core_release())) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    boolean z13 = cardMultilineWidget.f22503w;
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: s40.o
                                                        @Override // android.view.View.OnFocusChangeListener
                                                        public final void onFocusChange(View view, boolean z4) {
                                                            int i18 = i17;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    if (z4) {
                                                                        cardMultilineWidget.getClass();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    if (!z4) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    } else if (!cardMultilineWidget.f22498a0 && !cardMultilineWidget.getBrand().m124355d(cardMultilineWidget.cvcEditText.getFieldText$payments_core_release())) {
                                                                        cardBrandView2.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    boolean z13 = cardMultilineWidget.f22503w;
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    ExpiryDateEditText expiryDateEditText2 = this.expiryDateEditText;
                                                    expiryDateEditText2.setDeleteEmptyListener(new C29934u0(this.cardNumberEditText));
                                                    CvcEditText cvcEditText2 = this.cvcEditText;
                                                    cvcEditText2.setDeleteEmptyListener(new C29934u0(expiryDateEditText2));
                                                    this.postalCodeEditText.setDeleteEmptyListener(new C29934u0(cvcEditText2));
                                                    this.cardNumberEditText.setCompletionCallback$payments_core_release(new InterfaceC4339a() { // from class: s40.m
                                                        @Override // c93.InterfaceC4339a
                                                        public final Object invoke() {
                                                            int i18 = i13;
                                                            C23454a0 c23454a0 = C23454a0.f92919a;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    cardMultilineWidget.post(new RunnableC32167n(2, cardMultilineWidget));
                                                                    break;
                                                                default:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    cardMultilineWidget.post(new RunnableC32167n(0, cardMultilineWidget));
                                                                    break;
                                                            }
                                                            return c23454a0;
                                                        }
                                                    });
                                                    this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new Function1() { // from class: s40.p
                                                        @Override // p715kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i18 = i13;
                                                            C23454a0 c23454a0 = C23454a0.f92919a;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    EnumC38853i brand = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand, "brand");
                                                                    cardMultilineWidget.cardBrandView.setBrand(brand);
                                                                    cardMultilineWidget.m16904b();
                                                                    break;
                                                                case 1:
                                                                    EnumC38853i brand2 = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand2, "brand");
                                                                    cardMultilineWidget.cvcEditText.m16915f(brand2, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                case 2:
                                                                    List<? extends EnumC38853i> brands = (List) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr3 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brands, "brands");
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    EnumC38853i brand3 = cardBrandView2.getBrand();
                                                                    cardBrandView2.setPossibleBrands(brands);
                                                                    if (!brands.contains(brand3)) {
                                                                        cardBrandView2.setBrand(EnumC38853i.Unknown);
                                                                    }
                                                                    EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74100H0(brands);
                                                                    if (enumC38853i == null) {
                                                                        enumC38853i = EnumC38853i.Unknown;
                                                                    }
                                                                    cardMultilineWidget.cvcEditText.m16915f(enumC38853i, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                default:
                                                                    cardMultilineWidget.cardNumberTextInputLayout.setLoading$payments_core_release(((Boolean) obj).booleanValue());
                                                                    break;
                                                            }
                                                            return c23454a0;
                                                        }
                                                    });
                                                    this.cardNumberEditText.setImplicitCardBrandChangeCallback$payments_core_release(new Function1() { // from class: s40.p
                                                        @Override // p715kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i18 = i14;
                                                            C23454a0 c23454a0 = C23454a0.f92919a;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    EnumC38853i brand = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand, "brand");
                                                                    cardMultilineWidget.cardBrandView.setBrand(brand);
                                                                    cardMultilineWidget.m16904b();
                                                                    break;
                                                                case 1:
                                                                    EnumC38853i brand2 = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand2, "brand");
                                                                    cardMultilineWidget.cvcEditText.m16915f(brand2, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                case 2:
                                                                    List<? extends EnumC38853i> brands = (List) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr3 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brands, "brands");
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    EnumC38853i brand3 = cardBrandView2.getBrand();
                                                                    cardBrandView2.setPossibleBrands(brands);
                                                                    if (!brands.contains(brand3)) {
                                                                        cardBrandView2.setBrand(EnumC38853i.Unknown);
                                                                    }
                                                                    EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74100H0(brands);
                                                                    if (enumC38853i == null) {
                                                                        enumC38853i = EnumC38853i.Unknown;
                                                                    }
                                                                    cardMultilineWidget.cvcEditText.m16915f(enumC38853i, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                default:
                                                                    cardMultilineWidget.cardNumberTextInputLayout.setLoading$payments_core_release(((Boolean) obj).booleanValue());
                                                                    break;
                                                            }
                                                            return c23454a0;
                                                        }
                                                    });
                                                    this.cardNumberEditText.setPossibleCardBrandsCallback$payments_core_release(new Function1() { // from class: s40.p
                                                        @Override // p715kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i18 = i16;
                                                            C23454a0 c23454a0 = C23454a0.f92919a;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    EnumC38853i brand = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand, "brand");
                                                                    cardMultilineWidget.cardBrandView.setBrand(brand);
                                                                    cardMultilineWidget.m16904b();
                                                                    break;
                                                                case 1:
                                                                    EnumC38853i brand2 = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand2, "brand");
                                                                    cardMultilineWidget.cvcEditText.m16915f(brand2, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                case 2:
                                                                    List<? extends EnumC38853i> brands = (List) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr3 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brands, "brands");
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    EnumC38853i brand3 = cardBrandView2.getBrand();
                                                                    cardBrandView2.setPossibleBrands(brands);
                                                                    if (!brands.contains(brand3)) {
                                                                        cardBrandView2.setBrand(EnumC38853i.Unknown);
                                                                    }
                                                                    EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74100H0(brands);
                                                                    if (enumC38853i == null) {
                                                                        enumC38853i = EnumC38853i.Unknown;
                                                                    }
                                                                    cardMultilineWidget.cvcEditText.m16915f(enumC38853i, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                default:
                                                                    cardMultilineWidget.cardNumberTextInputLayout.setLoading$payments_core_release(((Boolean) obj).booleanValue());
                                                                    break;
                                                            }
                                                            return c23454a0;
                                                        }
                                                    });
                                                    this.expiryDateEditText.setCompletionCallback$payments_core_release(new InterfaceC4339a() { // from class: s40.m
                                                        @Override // c93.InterfaceC4339a
                                                        public final Object invoke() {
                                                            int i18 = i14;
                                                            C23454a0 c23454a0 = C23454a0.f92919a;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    cardMultilineWidget.post(new RunnableC32167n(2, cardMultilineWidget));
                                                                    break;
                                                                default:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    cardMultilineWidget.post(new RunnableC32167n(0, cardMultilineWidget));
                                                                    break;
                                                            }
                                                            return c23454a0;
                                                        }
                                                    });
                                                    this.cvcEditText.setAfterTextChangedListener(new InterfaceC32143d1() { // from class: s40.q
                                                        @Override // s40.InterfaceC32143d1
                                                        /* JADX INFO: renamed from: a */
                                                        public final void mo100093a(String str) {
                                                            int i18 = i13;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    CvcEditText cvcEditText3 = cardMultilineWidget.cvcEditText;
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    CardNumberEditText cardNumberEditText2 = cardMultilineWidget.cardNumberEditText;
                                                                    EnumC38853i implicitCardBrandForCbc = cardNumberEditText2.getImplicitCardBrandForCbc();
                                                                    if (implicitCardBrandForCbc == EnumC38853i.Unknown) {
                                                                        implicitCardBrandForCbc = null;
                                                                    }
                                                                    if (implicitCardBrandForCbc == null) {
                                                                        implicitCardBrandForCbc = cardNumberEditText2.getCardBrand();
                                                                    }
                                                                    if (implicitCardBrandForCbc.m124355d(str)) {
                                                                        cardMultilineWidget.m16904b();
                                                                        if (cardMultilineWidget.f22503w) {
                                                                            cardMultilineWidget.post(new RunnableC32167n(1, cardMultilineWidget));
                                                                        }
                                                                    } else if (!cardMultilineWidget.f22498a0 && !cardMultilineWidget.getBrand().m124355d(cvcEditText3.getFieldText$payments_core_release())) {
                                                                        cardMultilineWidget.cardBrandView.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                    }
                                                                    cvcEditText3.setShouldShowError(false);
                                                                    break;
                                                                default:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    if ((cardMultilineWidget.postalCodeRequired || cardMultilineWidget.getUsZipCodeRequired()) && cardMultilineWidget.f22503w) {
                                                                        PostalCodeEditText postalCodeEditText2 = cardMultilineWidget.postalCodeEditText;
                                                                        if ((postalCodeEditText2.getConfig$payments_core_release() != EnumC32184v0.f133295x || !PostalCodeEditText.f22557a0.matcher(postalCodeEditText2.getFieldText$payments_core_release()).matches()) && postalCodeEditText2.getConfig$payments_core_release() == EnumC32184v0.f133294w) {
                                                                            postalCodeEditText2.getFieldText$payments_core_release().getClass();
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    this.postalCodeEditText.setAfterTextChangedListener(new InterfaceC32143d1() { // from class: s40.q
                                                        @Override // s40.InterfaceC32143d1
                                                        /* JADX INFO: renamed from: a */
                                                        public final void mo100093a(String str) {
                                                            int i18 = i14;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    CvcEditText cvcEditText3 = cardMultilineWidget.cvcEditText;
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    CardNumberEditText cardNumberEditText2 = cardMultilineWidget.cardNumberEditText;
                                                                    EnumC38853i implicitCardBrandForCbc = cardNumberEditText2.getImplicitCardBrandForCbc();
                                                                    if (implicitCardBrandForCbc == EnumC38853i.Unknown) {
                                                                        implicitCardBrandForCbc = null;
                                                                    }
                                                                    if (implicitCardBrandForCbc == null) {
                                                                        implicitCardBrandForCbc = cardNumberEditText2.getCardBrand();
                                                                    }
                                                                    if (implicitCardBrandForCbc.m124355d(str)) {
                                                                        cardMultilineWidget.m16904b();
                                                                        if (cardMultilineWidget.f22503w) {
                                                                            cardMultilineWidget.post(new RunnableC32167n(1, cardMultilineWidget));
                                                                        }
                                                                    } else if (!cardMultilineWidget.f22498a0 && !cardMultilineWidget.getBrand().m124355d(cvcEditText3.getFieldText$payments_core_release())) {
                                                                        cardMultilineWidget.cardBrandView.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
                                                                    }
                                                                    cvcEditText3.setShouldShowError(false);
                                                                    break;
                                                                default:
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    if ((cardMultilineWidget.postalCodeRequired || cardMultilineWidget.getUsZipCodeRequired()) && cardMultilineWidget.f22503w) {
                                                                        PostalCodeEditText postalCodeEditText2 = cardMultilineWidget.postalCodeEditText;
                                                                        if ((postalCodeEditText2.getConfig$payments_core_release() != EnumC32184v0.f133295x || !PostalCodeEditText.f22557a0.matcher(postalCodeEditText2.getFieldText$payments_core_release()).matches()) && postalCodeEditText2.getConfig$payments_core_release() == EnumC32184v0.f133294w) {
                                                                            postalCodeEditText2.getFieldText$payments_core_release().getClass();
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    m16903a(this.f22503w);
                                                    CardNumberEditText.m16908f(this.cardNumberEditText);
                                                    m16904b();
                                                    Iterator<T> it = getAllFields().iterator();
                                                    while (it.hasNext()) {
                                                        ((StripeEditText) it.next()).addTextChangedListener(new C32138c(this, 1));
                                                    }
                                                    this.cardNumberEditText.setLoadingCallback$payments_core_release(new Function1() { // from class: s40.p
                                                        @Override // p715kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i18 = i17;
                                                            C23454a0 c23454a0 = C23454a0.f92919a;
                                                            CardMultilineWidget cardMultilineWidget = this;
                                                            switch (i18) {
                                                                case 0:
                                                                    EnumC38853i brand = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand, "brand");
                                                                    cardMultilineWidget.cardBrandView.setBrand(brand);
                                                                    cardMultilineWidget.m16904b();
                                                                    break;
                                                                case 1:
                                                                    EnumC38853i brand2 = (EnumC38853i) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr2 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brand2, "brand");
                                                                    cardMultilineWidget.cvcEditText.m16915f(brand2, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                case 2:
                                                                    List<? extends EnumC38853i> brands = (List) obj;
                                                                    InterfaceC21493z[] interfaceC21493zArr3 = CardMultilineWidget.f22478f0;
                                                                    AbstractC22676k.m65750j(brands, "brands");
                                                                    CardBrandView cardBrandView2 = cardMultilineWidget.cardBrandView;
                                                                    EnumC38853i brand3 = cardBrandView2.getBrand();
                                                                    cardBrandView2.setPossibleBrands(brands);
                                                                    if (!brands.contains(brand3)) {
                                                                        cardBrandView2.setBrand(EnumC38853i.Unknown);
                                                                    }
                                                                    EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74100H0(brands);
                                                                    if (enumC38853i == null) {
                                                                        enumC38853i = EnumC38853i.Unknown;
                                                                    }
                                                                    cardMultilineWidget.cvcEditText.m16915f(enumC38853i, cardMultilineWidget.f22490P, cardMultilineWidget.f22491Q, cardMultilineWidget.cvcInputLayout);
                                                                    break;
                                                                default:
                                                                    cardMultilineWidget.cardNumberTextInputLayout.setLoading$payments_core_release(((Boolean) obj).booleanValue());
                                                                    break;
                                                            }
                                                            return c23454a0;
                                                        }
                                                    });
                                                    this.postalCodeEditText.setConfig$payments_core_release(EnumC32184v0.f133294w);
                                                    this.f22489O = true;
                                                    final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_card_form_view_text_input_layout_padding_horizontal);
                                                    this.cardBrandView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: s40.r
                                                        @Override // android.view.View.OnLayoutChangeListener
                                                        public final void onLayoutChange(View view, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29) {
                                                            InterfaceC21493z[] interfaceC21493zArr = CardMultilineWidget.f22478f0;
                                                            int width = view.getWidth() + dimensionPixelSize;
                                                            CardNumberEditText cardNumberEditText2 = this.cardNumberEditText;
                                                            cardNumberEditText2.setPadding(cardNumberEditText2.getPaddingLeft(), cardNumberEditText2.getPaddingTop(), width, cardNumberEditText2.getPaddingBottom());
                                                        }
                                                    });
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i15)));
    }

    private final Collection<StripeEditText> getAllFields() {
        return AbstractC25260n.m74059b1(new StripeEditText[]{this.cardNumberEditText, this.expiryDateEditText, this.cvcEditText, this.postalCodeEditText});
    }

    @InterfaceC23457c
    public static /* synthetic */ void getCardParams$annotations() {
    }

    private final C38816e2 getExpirationDate() {
        return this.expiryDateEditText.getValidatedDate();
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    /* JADX INFO: renamed from: a */
    public final void m16903a(boolean z4) {
        this.expiryTextInputLayout.setHint(getResources().getString(z4 ? R.string.stripe_expiry_label_short : R.string.stripe_acc_label_expiry_date));
        int i13 = z4 ? R.id.et_postal_code : -1;
        CvcEditText cvcEditText = this.cvcEditText;
        cvcEditText.setNextFocusForwardId(i13);
        cvcEditText.setNextFocusDownId(i13);
        int i14 = z4 ? 0 : 8;
        this.postalInputLayout.setVisibility(i14);
        cvcEditText.setImeOptions(i14 == 8 ? 6 : 5);
        TextInputLayout textInputLayout = this.cvcInputLayout;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(z4 ? getResources().getDimensionPixelSize(R.dimen.stripe_add_card_expiry_middle_margin) : 0);
        textInputLayout.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: b */
    public final void m16904b() {
        this.cvcEditText.m16915f(getBrand(), this.f22490P, this.f22491Q, this.cvcInputLayout);
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16905c() {
        String postalCode$payments_core_release;
        Object next;
        boolean z4 = getValidatedCardNumber$payments_core_release() != null;
        boolean z13 = getExpirationDate() != null;
        CvcEditText cvcEditText = this.cvcEditText;
        boolean z14 = cvcEditText.getCvc$payments_core_release() != null;
        this.cardNumberEditText.setShouldShowError(!z4);
        this.expiryDateEditText.setShouldShowError(!z13);
        cvcEditText.setShouldShowError(!z14);
        boolean z15 = this.postalCodeRequired;
        PostalCodeEditText postalCodeEditText = this.postalCodeEditText;
        postalCodeEditText.setShouldShowError((z15 || getUsZipCodeRequired()) && ((postalCode$payments_core_release = postalCodeEditText.getPostalCode$payments_core_release()) == null || AbstractC39414r.m125890i0(postalCode$payments_core_release)));
        Iterator<T> it = getAllFields().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((StripeEditText) next).getShouldShowError());
        StripeEditText stripeEditText = (StripeEditText) next;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        return z4 && z13 && z14 && !postalCodeEditText.getShouldShowError();
    }

    public final /* synthetic */ EnumC38853i getBrand() {
        return this.cardBrandView.getBrand();
    }

    /* JADX INFO: renamed from: getCardBrandView$payments_core_release, reason: from getter */
    public final CardBrandView getCardBrandView() {
        return this.cardBrandView;
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    public final InterfaceC32149f1 getCardNumberErrorListener$payments_core_release() {
        return (InterfaceC32149f1) this.f22499b0.getValue(this, f22478f0[2]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.cardNumberTextInputLayout;
    }

    public C38892m getCardParams() {
        if (!m16905c()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        C38816e2 validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Editable text = this.cvcEditText.getText();
        String string = text != null ? text.toString() : null;
        Editable text2 = this.postalCodeEditText.getText();
        String string2 = text2 != null ? text2.toString() : null;
        if (!this.f22503w) {
            string2 = null;
        }
        EnumC38853i brand = getBrand();
        Set setM34570S = AbstractC12350b.m34570S("CardMultilineView");
        C41186h validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
        String str = validatedCardNumber$payments_core_release != null ? validatedCardNumber$payments_core_release.f177701c : null;
        if (str == null) {
            str = "";
        }
        return new C38892m(brand, setM34570S, str, validatedDate.f167057a, validatedDate.f167058b, string, new C38793c(null, null, null, null, (string2 == null || AbstractC39414r.m125890i0(string2)) ? null : string2, null), this.cardBrandView.m16898b(), 1344);
    }

    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    public final InterfaceC32149f1 getCvcErrorListener$payments_core_release() {
        return (InterfaceC32149f1) this.f22501d0.getValue(this, f22478f0[4]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.cvcInputLayout;
    }

    public final InterfaceC32149f1 getExpirationDateErrorListener$payments_core_release() {
        return (InterfaceC32149f1) this.f22500c0.getValue(this, f22478f0[3]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.f22497W.getValue(this, f22478f0[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.expiryTextInputLayout;
    }

    public final Set<EnumC32187x> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        EnumC32187x enumC32187x = EnumC32187x.f133301w;
        EnumC32187x enumC32187x2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            enumC32187x = null;
        }
        EnumC32187x enumC32187x3 = EnumC32187x.f133302x;
        if (getExpirationDate() != null) {
            enumC32187x3 = null;
        }
        EnumC32187x enumC32187x4 = EnumC32187x.f133303y;
        if (this.cvcEditText.getCvc$payments_core_release() != null) {
            enumC32187x4 = null;
        }
        EnumC32187x enumC32187x5 = EnumC32187x.f133304z;
        if ((this.postalCodeRequired || getUsZipCodeRequired()) && this.f22503w && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || AbstractC39414r.m125890i0(postalCode$payments_core_release))) {
            enumC32187x2 = enumC32187x5;
        }
        return AbstractC25265s.m74103I1(AbstractC25260n.m74077r0(new EnumC32187x[]{enumC32187x, enumC32187x3, enumC32187x4, enumC32187x2}));
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final C38977v3 getPaymentMethodBillingDetails() {
        C38968u3 paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.m124398a();
        }
        return null;
    }

    public final C38968u3 getPaymentMethodBillingDetailsBuilder() {
        if (!this.f22503w || !m16905c()) {
            return null;
        }
        C38968u3 c38968u3 = new C38968u3();
        c38968u3.f167740a = new C38793c(null, null, null, null, this.postalCodeEditText.getPostalCode$payments_core_release(), null);
        return c38968u3;
    }

    public C38951s4 getPaymentMethodCard() {
        if (!m16905c()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        C38816e2 validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Editable text = this.cvcEditText.getText();
        String string = text != null ? text.toString() : null;
        C41186h validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
        String str = validatedCardNumber$payments_core_release != null ? validatedCardNumber$payments_core_release.f177701c : null;
        if (str == null) {
            str = "";
        }
        return new C38951s4(str, Integer.valueOf(validatedDate.f167057a), Integer.valueOf(validatedDate.f167058b), string, null, AbstractC12350b.m34570S("CardMultilineView"), this.cardBrandView.m16900d(), 16);
    }

    public C38809d5 getPaymentMethodCreateParams() {
        C38951s4 paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return C33647p.m106266h(paymentMethodCard, getPaymentMethodBillingDetails(), 12);
        }
        return null;
    }

    /* JADX INFO: renamed from: getPostalCodeEditText$payments_core_release, reason: from getter */
    public final PostalCodeEditText getPostalCodeEditText() {
        return this.postalCodeEditText;
    }

    public final InterfaceC32149f1 getPostalCodeErrorListener$payments_core_release() {
        return (InterfaceC32149f1) this.f22502e0.getValue(this, f22478f0[5]);
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    /* JADX INFO: renamed from: getPostalInputLayout$payments_core_release, reason: from getter */
    public final TextInputLayout getPostalInputLayout() {
        return this.postalInputLayout;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.secondRowLayout;
    }

    /* JADX INFO: renamed from: getShouldShowErrorIcon$payments_core_release, reason: from getter */
    public final boolean getShouldShowErrorIcon() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.f22493S.getValue(this, f22478f0[0])).booleanValue();
    }

    public final C41186h getValidatedCardNumber$payments_core_release() {
        return this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
    }

    /* JADX INFO: renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final InterfaceC1583f2 getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.f22489O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cvcEditText.setHint((CharSequence) null);
        C32166m0 c32166m0 = this.f22486L;
        C1593i0 c1593i0 = c32166m0.f133238w;
        if (AbstractC1613o1.m5017g(this) == null) {
            c32166m0.f133240y.m88295a(null);
            c1593i0.m4991g(EnumC1632v.ON_CREATE);
            AbstractC1613o1.m5016f(c32166m0);
            AbstractC1613o1.m5024n(this, c32166m0);
            AbstractC1613o1.m5025o(this, c32166m0);
            AbstractC34132o.m107862G(this, c32166m0);
            c1593i0.m4991g(EnumC1632v.ON_RESUME);
        }
        AbstractC32145e0.m100097d(this, this.viewModelStoreOwner, new C30856a(this, 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C32166m0 c32166m0 = this.f22486L;
        C1593i0 c1593i0 = c32166m0.f133238w;
        if (AbstractC1613o1.m5017g(this) == null) {
            c1593i0.m4991g(EnumC1632v.ON_PAUSE);
            c1593i0.m4991g(EnumC1632v.ON_DESTROY);
            c32166m0.f133239x.m4975a();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        AbstractC22676k.m65750j(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        setOnBehalfOf(bundle.getString("state_on_behalf_of"));
        super.onRestoreInstanceState(bundle.getParcelable("state_remaining_state"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return AbstractC12889b.m36273g(new C23465k("state_remaining_state", super.onSaveInstanceState()), new C23465k("state_on_behalf_of", this.onBehalfOf));
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            m16904b();
        }
    }

    public void setCardHint(String cardHint) {
        AbstractC22676k.m65750j(cardHint, "cardHint");
        this.cardNumberTextInputLayout.setPlaceholderText(cardHint);
    }

    public void setCardInputListener(InterfaceC32163l listener) {
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumberEditText.setText(cardNumber);
    }

    public final void setCardNumberErrorListener(InterfaceC32149f1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(InterfaceC32149f1 interfaceC32149f1) {
        AbstractC22676k.m65750j(interfaceC32149f1, "<set-?>");
        this.f22499b0.setValue(this, f22478f0[2], interfaceC32149f1);
    }

    public void setCardNumberTextWatcher(TextWatcher cardNumberTextWatcher) {
        this.cardNumberEditText.addTextChangedListener(cardNumberTextWatcher);
    }

    public void setCardValidCallback(InterfaceC32189y callback) {
        C32177s c32177s;
        Iterator<T> it = getAllFields().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c32177s = this.f22488N;
            if (!zHasNext) {
                break;
            } else {
                ((StripeEditText) it.next()).removeTextChangedListener(c32177s);
            }
        }
        if (callback != null) {
            Iterator<T> it3 = getAllFields().iterator();
            while (it3.hasNext()) {
                ((StripeEditText) it3.next()).addTextChangedListener(c32177s);
            }
        }
    }

    public void setCvcCode(String cvcCode) {
        this.cvcEditText.setText(cvcCode);
    }

    public final void setCvcErrorListener(InterfaceC32149f1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(InterfaceC32149f1 interfaceC32149f1) {
        AbstractC22676k.m65750j(interfaceC32149f1, "<set-?>");
        this.f22501d0.setValue(this, f22478f0[4], interfaceC32149f1);
    }

    public final void setCvcIcon(Integer resId) {
        if (resId != null) {
            Drawable drawable = AbstractC32122c.getDrawable(getContext(), resId.intValue());
            if (drawable != null) {
                this.cvcEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
        }
        this.f22498a0 = resId != null;
    }

    public final void setCvcLabel(String cvcLabel) {
        this.f22490P = cvcLabel;
        this.cvcEditText.m16915f(getBrand(), this.f22490P, this.f22491Q, this.cvcInputLayout);
    }

    public void setCvcNumberTextWatcher(TextWatcher cvcNumberTextWatcher) {
        this.cvcEditText.addTextChangedListener(cvcNumberTextWatcher);
    }

    public final void setCvcPlaceholderText(String cvcPlaceholderText) {
        this.f22491Q = cvcPlaceholderText;
        this.cvcEditText.m16915f(getBrand(), this.f22490P, this.f22491Q, this.cvcInputLayout);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator it = this.f22487M.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(enabled);
        }
        this.f22489O = enabled;
    }

    public final void setExpirationDateErrorListener(InterfaceC32149f1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(InterfaceC32149f1 interfaceC32149f1) {
        AbstractC22676k.m65750j(interfaceC32149f1, "<set-?>");
        this.f22500c0.setValue(this, f22478f0[3], interfaceC32149f1);
    }

    public final void setExpirationDatePlaceholderRes(Integer resId) {
        setExpirationDatePlaceholderRes$payments_core_release(resId);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.f22497W.setValue(this, f22478f0[1], num);
    }

    public void setExpiryDateTextWatcher(TextWatcher expiryDateTextWatcher) {
        this.expiryDateEditText.addTextChangedListener(expiryDateTextWatcher);
    }

    public final void setOnBehalfOf(String str) {
        if (AbstractC22676k.m65745e(this.onBehalfOf, str)) {
            return;
        }
        if (isAttachedToWindow()) {
            AbstractC32145e0.m100097d(this, this.viewModelStoreOwner, new C2665z(str, 12, (byte) 0));
        }
        this.onBehalfOf = str;
    }

    public final void setPostalCodeErrorListener(InterfaceC32149f1 listener) {
        setPostalCodeErrorListener$payments_core_release(listener);
    }

    public final void setPostalCodeErrorListener$payments_core_release(InterfaceC32149f1 interfaceC32149f1) {
        this.f22502e0.setValue(this, f22478f0[5], interfaceC32149f1);
    }

    public final void setPostalCodeRequired(boolean z4) {
        this.postalCodeRequired = z4;
    }

    public void setPostalCodeTextWatcher(TextWatcher postalCodeTextWatcher) {
        this.postalCodeEditText.addTextChangedListener(postalCodeTextWatcher);
    }

    public final void setPreferredNetworks(List<? extends EnumC38853i> preferredNetworks) {
        AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
        this.cardBrandView.setMerchantPreferredNetworks(preferredNetworks);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z4) {
        boolean z13 = this.shouldShowErrorIcon != z4;
        this.shouldShowErrorIcon = z4;
        if (z13) {
            m16904b();
        }
    }

    public final void setShouldShowPostalCode(boolean shouldShowPostalCode) {
        this.f22503w = shouldShowPostalCode;
        m16903a(shouldShowPostalCode);
    }

    public final void setUsZipCodeRequired(boolean z4) {
        this.f22493S.setValue(this, f22478f0[0], Boolean.valueOf(z4));
    }

    public final void setViewModelStoreOwner$payments_core_release(InterfaceC1583f2 interfaceC1583f2) {
        this.viewModelStoreOwner = interfaceC1583f2;
    }
}
