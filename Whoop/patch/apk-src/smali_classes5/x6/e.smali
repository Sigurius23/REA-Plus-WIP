.class public final Lx6/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lp6/l;

.field public F:I

.field public w:Landroid/content/Context;

.field public x:Lkotlin/jvm/functions/Function1;

.field public y:Ldc3/c;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp6/l;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lx6/e;->E:Lp6/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx6/e;->z:Ljava/lang/Object;

    iget p1, p0, Lx6/e;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/e;->F:I

    iget-object p1, p0, Lx6/e;->E:Lp6/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lp6/l;->c(Landroid/content/Context;Lwc/e1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
