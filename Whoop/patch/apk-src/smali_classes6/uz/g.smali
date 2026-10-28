.class public final Luz/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Luz/o;

.field public F:I

.field public w:Luz/o;

.field public x:Ljava/lang/String;

.field public y:Lio/sentry/android/replay/video/d;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Luz/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Luz/g;->E:Luz/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luz/g;->z:Ljava/lang/Object;

    iget p1, p0, Luz/g;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luz/g;->F:I

    iget-object p1, p0, Luz/g;->E:Luz/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Luz/o;->b(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
