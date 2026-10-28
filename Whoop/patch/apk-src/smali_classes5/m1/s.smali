.class public final Lm1/s;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/j2;


# instance fields
.field public O:Lkx1/b;


# virtual methods
.method public final Q0()V
    .locals 2

    new-instance v0, Lm01/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm01/c;-><init>(I)V

    sget-object v1, Lm1/d0;->a:Lm1/d0;

    invoke-static {p0, v1, v0}, La3/g;->r(La3/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final n(Li3/z;)V
    .locals 2

    new-instance v0, Llc0/c;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    sget-object p1, Lm1/d0;->a:Lm1/d0;

    invoke-static {p0, p1, v0}, La3/g;->r(La3/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lm1/s;->O:Lkx1/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
