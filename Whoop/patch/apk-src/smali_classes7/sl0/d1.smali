.class public final synthetic Lsl0/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Lsl0/y0;

.field public final synthetic x:I

.field public final synthetic y:Lnl0/f;

.field public final synthetic z:Lm91/u;


# direct methods
.method public synthetic constructor <init>(Lsl0/y0;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/d1;->w:Lsl0/y0;

    iput p2, p0, Lsl0/d1;->x:I

    iput-object p3, p0, Lsl0/d1;->y:Lnl0/f;

    iput-object p4, p0, Lsl0/d1;->z:Lm91/u;

    iput-object p5, p0, Lsl0/d1;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lsl0/d1;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lsl0/d1;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v5, p0, Lsl0/d1;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lsl0/d1;->G:Lp1/c1;

    iget-object v0, p0, Lsl0/d1;->w:Lsl0/y0;

    iget v1, p0, Lsl0/d1;->x:I

    iget-object v2, p0, Lsl0/d1;->y:Lnl0/f;

    iget-object v3, p0, Lsl0/d1;->z:Lm91/u;

    iget-object v4, p0, Lsl0/d1;->E:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lsl0/g1;->j(Lsl0/y0;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
