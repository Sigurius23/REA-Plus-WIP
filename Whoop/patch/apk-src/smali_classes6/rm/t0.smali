.class public final Lrm/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/q0;


# instance fields
.field public final a:Lsn/q;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayList;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lsn/a;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsn/q;

    invoke-direct {v0, p1, p2}, Lsn/q;-><init>(Lsn/a;Z)V

    iput-object v0, p0, Lrm/t0;->a:Lsn/q;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lrm/t0;->c:Ljava/util/ArrayList;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/t0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrm/t0;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lrm/o1;
    .locals 1

    iget-object v0, p0, Lrm/t0;->a:Lsn/q;

    iget-object v0, v0, Lsn/q;->o:Lsn/o;

    return-object v0
.end method
