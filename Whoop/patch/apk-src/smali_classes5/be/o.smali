.class public final Lbe/o;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Object;

.field public F:J

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lbe/q;

.field public I:I

.field public w:Lug/a;

.field public x:Log/g;

.field public y:Lvf/b;

.field public z:Lrf/l;


# direct methods
.method public constructor <init>(Lbe/q;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbe/o;->H:Lbe/q;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbe/o;->G:Ljava/lang/Object;

    iget p1, p0, Lbe/o;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbe/o;->I:I

    iget-object p1, p0, Lbe/o;->H:Lbe/q;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lbe/q;->a(Lbe/q;Lug/a;Luf/u;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
