.class public final Lwz/x;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lwz/y;

.field public G:I

.field public w:Lwz/y;

.field public x:Ljava/lang/Object;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lwz/y;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwz/x;->F:Lwz/y;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lwz/x;->E:Ljava/lang/Object;

    iget p1, p0, Lwz/x;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwz/x;->G:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lwz/x;->F:Lwz/y;

    invoke-virtual {v1, p1, v0, p1, p0}, Lwz/y;->r(ZLcom/stripe/android/model/ConsumerSessionRefresh;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
