.class public final Le53/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lio/sentry/internal/debugmeta/c;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lio/sentry/internal/debugmeta/c;

.field public z:I


# direct methods
.method public constructor <init>(Lio/sentry/internal/debugmeta/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le53/a;->y:Lio/sentry/internal/debugmeta/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le53/a;->x:Ljava/lang/Object;

    iget p1, p0, Le53/a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le53/a;->z:I

    iget-object p1, p0, Le53/a;->y:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
