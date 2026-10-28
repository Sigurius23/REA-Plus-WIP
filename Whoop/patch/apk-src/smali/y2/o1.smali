.class public final Ly2/o1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/p2;


# instance fields
.field public O:Ly2/q;

.field public final P:Lb3/t0;


# direct methods
.method public constructor <init>(Ly2/q;)V
    .locals 2

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Ly2/o1;->O:Ly2/q;

    new-instance v0, Lb3/t0;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p0, p1}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ly2/o1;->P:Lb3/t0;

    return-void
.end method


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 6

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v1, p2, Ly2/j1;->w:I

    iget v2, p2, Ly2/j1;->x:I

    new-instance v5, Lc0/g0;

    const/4 p3, 0x3

    invoke-direct {v5, p2, p3}, Lc0/g0;-><init>(Ly2/j1;I)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    iget-object v4, p0, Ly2/o1;->P:Lb3/t0;

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Ly2/t0;->x0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    const-string v0, "androidx.compose.ui.layout.WindowInsetsRulers"

    return-object v0
.end method
