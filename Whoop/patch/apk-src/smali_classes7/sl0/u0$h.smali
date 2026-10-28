.class final Lsl0/u0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u0;->V(Lnl0/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;ZLkotlin/jvm/functions/Function3;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic F:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic w:Lsl0/y0;

.field final synthetic x:I

.field final synthetic y:Lnl0/f;

.field final synthetic z:Lm91/u;


# direct methods
.method public constructor <init>(Lsl0/y0;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/y0;",
            "I",
            "Lnl0/f;",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/u0$h;->w:Lsl0/y0;

    iput p2, p0, Lsl0/u0$h;->x:I

    iput-object p3, p0, Lsl0/u0$h;->y:Lnl0/f;

    iput-object p4, p0, Lsl0/u0$h;->z:Lm91/u;

    iput-object p5, p0, Lsl0/u0$h;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lsl0/u0$h;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lsl0/u0$h;->w:Lsl0/y0;

    iget v3, p0, Lsl0/u0$h;->x:I

    iget-object v4, p0, Lsl0/u0$h;->y:Lnl0/f;

    iget-object v5, p0, Lsl0/u0$h;->z:Lm91/u;

    iget-object v6, p0, Lsl0/u0$h;->E:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lsl0/u0$h;->F:Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Lsl0/y0;->a(Ljava/lang/Object;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsl0/u0$h;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
