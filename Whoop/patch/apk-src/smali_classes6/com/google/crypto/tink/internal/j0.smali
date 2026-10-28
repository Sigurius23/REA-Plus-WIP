.class public final Lcom/google/crypto/tink/internal/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lvs/n3;

.field public final c:Lvs/h4;

.field public final d:I

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lct/a;Lvs/n3;Lvs/h4;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/crypto/tink/internal/j0;->b:Lvs/n3;

    iput-object p4, p0, Lcom/google/crypto/tink/internal/j0;->c:Lvs/h4;

    iput p5, p0, Lcom/google/crypto/tink/internal/j0;->d:I

    iput-object p6, p0, Lcom/google/crypto/tink/internal/j0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/internal/j0;->d:I

    return v0
.end method
