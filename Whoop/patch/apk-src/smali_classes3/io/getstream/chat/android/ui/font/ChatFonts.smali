.class public interface abstract Lio/getstream/chat/android/ui/font/ChatFonts;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/font/ChatFonts$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0007\u0010\u000bJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/font/ChatFonts;",
        "",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "textStyle",
        "Landroid/widget/TextView;",
        "textView",
        "Ll83/a0;",
        "setFont",
        "(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;)V",
        "Landroid/graphics/Typeface;",
        "defaultTypeface",
        "(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;Landroid/graphics/Typeface;)V",
        "getFont",
        "(Lio/getstream/chat/android/ui/font/TextStyle;)Landroid/graphics/Typeface;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic setFont$default(Lio/getstream/chat/android/ui/font/ChatFonts;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;Landroid/graphics/Typeface;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const-string p4, "DEFAULT"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/font/ChatFonts;->setFont(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setFont"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract getFont(Lio/getstream/chat/android/ui/font/TextStyle;)Landroid/graphics/Typeface;
.end method

.method public abstract setFont(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;)V
.end method

.method public abstract setFont(Lio/getstream/chat/android/ui/font/TextStyle;Landroid/widget/TextView;Landroid/graphics/Typeface;)V
.end method
