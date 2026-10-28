.class public final Luz/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Luz/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luz/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Luz/j;->w:Luz/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    check-cast p2, Lcom/stripe/hcaptcha/HCaptchaException;

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "exception"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    sget-object p2, Lu40/d;->z:Lu40/d;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
