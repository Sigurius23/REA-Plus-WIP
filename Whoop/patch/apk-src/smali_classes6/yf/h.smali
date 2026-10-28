.class public final Lyf/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lyf/i;

.field public F:I

.field public w:Lyf/k;

.field public x:Lyf/i;

.field public y:J

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyf/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lyf/h;->E:Lyf/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lyf/h;->z:Ljava/lang/Object;

    iget p1, p0, Lyf/h;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyf/h;->F:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    iget-object v2, p0, Lyf/h;->E:Lyf/i;

    invoke-virtual {v2, p1, v0, v1, p0}, Lyf/i;->b(Lyf/k;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
