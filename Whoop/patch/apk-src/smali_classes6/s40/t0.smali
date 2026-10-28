.class public final Ls40/t0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ls40/s0;

.field public final synthetic G:Ljava/lang/String;

.field public final w:Lyx/b;

.field public final x:Lyy/j;

.field public final y:Lb10/b;

.field public final z:Ll83/p;


# direct methods
.method public constructor <init>(Lyx/b;Lyy/j;Lb10/b;)V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Ls40/t0;->w:Lyx/b;

    iput-object p2, p0, Ls40/t0;->x:Lyy/j;

    iput-object p3, p0, Ls40/t0;->y:Lb10/b;

    new-instance p2, Lq80/h;

    const/16 p3, 0x1c

    invoke-direct {p2, p0, p3}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Ls40/t0;->z:Ll83/p;

    iget-object p1, p1, Lyx/b;->G:Lm30/g;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iget-object p3, p1, Lm30/g;->G:Ljava/lang/String;

    if-eqz p3, :cond_0

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object p3, p2

    :cond_1
    iput-object p3, p0, Ls40/t0;->E:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object p3, p1, Lm30/g;->F:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move-object p3, p2

    :cond_3
    if-eqz p3, :cond_4

    new-instance v0, Ls40/s0;

    invoke-direct {v0, p3, p1}, Ls40/s0;-><init>(Ljava/lang/String;Lm30/g;)V

    goto :goto_0

    :cond_4
    move-object v0, p2

    :goto_0
    iput-object v0, p0, Ls40/t0;->F:Ls40/s0;

    if-eqz p1, :cond_5

    iget-object p2, p1, Lm30/g;->z:Ljava/lang/String;

    :cond_5
    iput-object p2, p0, Ls40/t0;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g()Lv10/b;
    .locals 8

    new-instance v0, Lv10/b;

    iget-object v1, p0, Ls40/t0;->w:Lyx/b;

    move-object v2, v1

    iget-object v1, v2, Lyx/b;->y:Ljava/lang/String;

    iget-object v3, v2, Lyx/b;->z:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    :cond_0
    move-object v5, v3

    iget-object v6, v2, Lyx/b;->H:Ljava/lang/String;

    const/16 v7, 0x2e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method
