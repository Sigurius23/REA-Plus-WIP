.class public final Luf/r;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Luf/f0;

.field public x:Lkotlin/time/Duration;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Luf/s;


# direct methods
.method public constructor <init>(Luf/s;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Luf/r;->z:Luf/s;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luf/r;->y:Ljava/lang/Object;

    iget p1, p0, Luf/r;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luf/r;->E:I

    iget-object p1, p0, Luf/r;->z:Luf/s;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Luf/s;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
