.class public final Lh/j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lkotlin/jvm/internal/b0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/b0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh/j;->w:Lkotlin/jvm/internal/b0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    new-instance p1, Lh/j;

    iget-object p2, p0, Lh/j;->w:Lkotlin/jvm/internal/b0;

    invoke-direct {p1, p2, p3}, Lh/j;-><init>(Lkotlin/jvm/internal/b0;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh/j;->w:Lkotlin/jvm/internal/b0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lkotlin/jvm/internal/b0;->w:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
