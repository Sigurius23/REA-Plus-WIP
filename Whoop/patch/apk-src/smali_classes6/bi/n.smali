.class public final Lbi/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lbi/o;

.field public F:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbi/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbi/n;->E:Lbi/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbi/n;->z:Ljava/lang/Object;

    iget p1, p0, Lbi/n;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbi/n;->F:I

    iget-object p1, p0, Lbi/n;->E:Lbi/o;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lbi/o;->c(Lbi/o;Lth/g;Lbi/s;Lbi/s;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
