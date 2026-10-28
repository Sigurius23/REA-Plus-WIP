.class public final Lrf/r;
.super Lpf/i;
.source "SourceFile"


# static fields
.field public static final m:Lrf/r;


# instance fields
.field public final k:I

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrf/r;

    new-instance v1, Lrf/q;

    invoke-direct {v1}, Lrf/q;-><init>()V

    invoke-direct {v0, v1}, Lrf/r;-><init>(Lrf/q;)V

    sput-object v0, Lrf/r;->m:Lrf/r;

    return-void
.end method

.method public constructor <init>(Lrf/q;)V
    .locals 1

    invoke-direct {p0, p1}, Lpf/i;-><init>(Lrf/q;)V

    iget-object v0, p1, Lrf/q;->j:Ll83/t;

    if-eqz v0, :cond_0

    iget v0, v0, Ll83/t;->w:I

    goto :goto_0

    :cond_0
    iget v0, p1, Lpf/h;->f:I

    :goto_0
    iput v0, p0, Lrf/r;->k:I

    iget-boolean p1, p1, Lrf/q;->l:Z

    iput-boolean p1, p0, Lrf/r;->l:Z

    return-void
.end method
