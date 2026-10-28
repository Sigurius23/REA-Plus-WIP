.class public final Lp7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;ZZ)V
    .locals 1

    const-string v0, "changes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp7/a;->a:Ljava/util/List;

    iput-object p2, p0, Lp7/a;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lp7/a;->c:Z

    iput-boolean p4, p0, Lp7/a;->d:Z

    return-void
.end method
