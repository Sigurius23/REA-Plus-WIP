.class public final Lt23/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lt23/f;

.field public x:J

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lt23/f;


# direct methods
.method public constructor <init>(Lt23/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/a;->z:Lt23/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt23/a;->y:Ljava/lang/Object;

    iget p1, p0, Lt23/a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/a;->E:I

    iget-object p1, p0, Lt23/a;->z:Lt23/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lt23/f;->a(Lt23/f;Lt23/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
