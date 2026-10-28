.class public final Lf53/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lio/sentry/internal/debugmeta/c;

.field public y:I


# direct methods
.method public constructor <init>(Lio/sentry/internal/debugmeta/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lf53/l;->x:Lio/sentry/internal/debugmeta/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf53/l;->w:Ljava/lang/Object;

    iget p1, p0, Lf53/l;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf53/l;->y:I

    iget-object p1, p0, Lf53/l;->x:Lio/sentry/internal/debugmeta/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lio/sentry/internal/debugmeta/c;->A(Lb2/y;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
