.class public final Ll30/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:[Ll83/k;

.field public F:Ljava/lang/String;

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ll30/e;

.field public J:I

.field public w:Ll30/e;

.field public x:Ljava/lang/String;

.field public y:Lq30/q0;

.field public z:[Ll83/k;


# direct methods
.method public constructor <init>(Ll30/e;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ll30/d;->I:Ll30/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ll30/d;->H:Ljava/lang/Object;

    iget p1, p0, Ll30/d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ll30/d;->J:I

    iget-object p1, p0, Ll30/d;->I:Ll30/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ll30/e;->a(Ljava/lang/String;Lq30/q0;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
