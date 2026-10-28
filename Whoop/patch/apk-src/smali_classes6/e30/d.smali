.class public final Le30/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln53/e;

.field public final b:Lec3/f2;

.field public final c:Ln53/e;

.field public final d:Lec3/f2;

.field public final e:Ld30/g;

.field public final f:Z

.field public final g:Lh02/n0;


# direct methods
.method public constructor <init>(Ln53/e;Lec3/r1;Ln53/e;Lec3/f2;Ld30/g;ZLh02/n0;)V
    .locals 1

    const-string v0, "customerState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkEnabled"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le30/d;->a:Ln53/e;

    iput-object p2, p0, Le30/d;->b:Lec3/f2;

    iput-object p3, p0, Le30/d;->c:Ln53/e;

    iput-object p4, p0, Le30/d;->d:Lec3/f2;

    iput-object p5, p0, Le30/d;->e:Ld30/g;

    iput-boolean p6, p0, Le30/d;->f:Z

    iput-object p7, p0, Le30/d;->g:Lh02/n0;

    return-void
.end method
