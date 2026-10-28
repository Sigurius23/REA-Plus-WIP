.class public final Lg20/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln10/j0;

.field public final b:Ln10/j0;

.field public final c:Lj/d;

.field public final d:Ljava/lang/Integer;

.field public final e:Z

.field public final f:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ln10/j0;Ln10/j0;Lj/d;Ljava/lang/Integer;ZLjava/util/Set;)V
    .locals 1

    const-string v0, "hostActivityLauncher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg20/w;->a:Ln10/j0;

    iput-object p2, p0, Lg20/w;->b:Ln10/j0;

    iput-object p3, p0, Lg20/w;->c:Lj/d;

    iput-object p4, p0, Lg20/w;->d:Ljava/lang/Integer;

    iput-boolean p5, p0, Lg20/w;->e:Z

    iput-object p6, p0, Lg20/w;->f:Ljava/util/Set;

    return-void
.end method
