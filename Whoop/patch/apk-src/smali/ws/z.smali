.class public final Lws/z;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lws/x;

.field public final c:Ljava/math/BigInteger;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lws/x;Ljava/math/BigInteger;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lws/z;->b:Lws/x;

    iput-object p2, p0, Lws/z;->c:Ljava/math/BigInteger;

    iput-object p3, p0, Lws/z;->d:Lct/a;

    iput-object p4, p0, Lws/z;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final V()Lct/a;
    .locals 1

    iget-object v0, p0, Lws/z;->d:Lct/a;

    return-object v0
.end method

.method public final z()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lws/z;->e:Ljava/lang/Integer;

    return-object v0
.end method
