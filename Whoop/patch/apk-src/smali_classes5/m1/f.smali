.class public final Lm1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lm1/g;


# direct methods
.method public constructor <init>(Lm1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/f;->a:Lm1/g;

    return-void
.end method

.method public static a(Lm1/f;F)V
    .locals 1

    iget-object p0, p0, Lm1/f;->a:Lm1/g;

    iget-object v0, p0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    iget-object p0, p0, Lm1/g;->k:Lp1/g1;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method
