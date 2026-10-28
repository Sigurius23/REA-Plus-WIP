.class public final Ltf/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ltf/d;

.field public G:I

.field public w:Luf/u;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Ltf/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ltf/c;->F:Ltf/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ltf/c;->E:Ljava/lang/Object;

    iget p1, p0, Ltf/c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ltf/c;->G:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Ltf/c;->F:Ltf/d;

    invoke-static {v1, p1, p1, v0, p0}, Ltf/d;->b(Ltf/d;Luf/u;Lyf/e;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
