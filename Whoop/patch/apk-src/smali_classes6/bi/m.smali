.class public final Lbi/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lbi/o;

.field public x:Lne3/h;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lbi/o;


# direct methods
.method public constructor <init>(Lbi/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbi/m;->z:Lbi/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbi/m;->y:Ljava/lang/Object;

    iget p1, p0, Lbi/m;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbi/m;->E:I

    iget-object p1, p0, Lbi/m;->z:Lbi/o;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lbi/o;->b(Lbi/o;Lbi/t;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
