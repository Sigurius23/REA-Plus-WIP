.class public final Luz/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx40/a;


# instance fields
.field public final synthetic w:Lbc3/m;


# direct methods
.method public constructor <init>(Lbc3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luz/i;->w:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final e(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luz/r;

    invoke-direct {v0, p1}, Luz/r;-><init>(Ljava/lang/Throwable;)V

    iget-object p1, p0, Luz/i;->w:Lbc3/m;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
