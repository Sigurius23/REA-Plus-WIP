.class public final Lws/e;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lws/c;

.field public final c:Ljava/security/spec/ECPoint;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lws/c;Ljava/security/spec/ECPoint;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lws/e;->b:Lws/c;

    iput-object p2, p0, Lws/e;->c:Ljava/security/spec/ECPoint;

    iput-object p3, p0, Lws/e;->d:Lct/a;

    iput-object p4, p0, Lws/e;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final V()Lct/a;
    .locals 1

    iget-object v0, p0, Lws/e;->d:Lct/a;

    return-object v0
.end method

.method public final z()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lws/e;->e:Ljava/lang/Integer;

    return-object v0
.end method
