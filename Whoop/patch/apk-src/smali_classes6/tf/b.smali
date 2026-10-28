.class public final Ltf/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ltf/d;

.field public F:I

.field public w:Luf/u;

.field public x:Lyf/e;

.field public y:Lrg/f;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltf/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ltf/b;->E:Ltf/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ltf/b;->z:Ljava/lang/Object;

    iget p1, p0, Ltf/b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ltf/b;->F:I

    iget-object p1, p0, Ltf/b;->E:Ltf/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ltf/d;->c(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
