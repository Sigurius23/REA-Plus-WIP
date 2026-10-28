.class public final Lha3/d;
.super Lha3/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lr93/e;Lu93/q0;Lu93/q0;Lr93/n0;)V
    .locals 13

    const-string v0, "ownerDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lu93/x;->k()Lr93/a0;

    move-result-object v4

    invoke-virtual {p2}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v5

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-interface/range {p4 .. p4}, Lr93/k;->getName()Lva3/h;

    move-result-object v7

    invoke-virtual {p2}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v8

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v3, Ls93/g;->a:Ls93/f;

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Lha3/f;-><init>(Lr93/k;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;Lr93/s0;Lr93/n0;IZLl83/k;)V

    return-void
.end method
