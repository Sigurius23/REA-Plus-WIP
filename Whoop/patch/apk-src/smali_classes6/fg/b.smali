.class public final Lfg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:D

.field public final c:D

.field public final d:D

.field public final e:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfg/b;

    new-instance v1, Lfg/a;

    invoke-direct {v1}, Lfg/a;-><init>()V

    invoke-direct {v0, v1}, Lfg/b;-><init>(Lfg/a;)V

    return-void
.end method

.method public constructor <init>(Lfg/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lfg/a;->a:J

    iput-wide v0, p0, Lfg/b;->a:J

    iget-wide v0, p1, Lfg/a;->b:D

    iput-wide v0, p0, Lfg/b;->b:D

    iget-wide v0, p1, Lfg/a;->c:D

    iput-wide v0, p0, Lfg/b;->c:D

    iget-wide v0, p1, Lfg/a;->d:D

    iput-wide v0, p0, Lfg/b;->d:D

    iget-wide v0, p1, Lfg/a;->e:D

    iput-wide v0, p0, Lfg/b;->e:D

    return-void
.end method
