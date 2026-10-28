.class public final Lwc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    const-string v0, "roleArn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webIdentityTokenFilePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lwc/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lwc/b;->c:Ljava/lang/String;

    iput-wide p4, p0, Lwc/b;->d:J

    const/4 p1, 0x0

    iput-object p1, p0, Lwc/b;->e:Ljava/util/ArrayList;

    return-void
.end method
