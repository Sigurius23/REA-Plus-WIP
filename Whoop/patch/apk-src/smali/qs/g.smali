.class public final Lqs/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/l;


# static fields
.field public static final b:Lqs/g;

.field public static final c:Lqs/g;

.field public static final d:Lcom/google/crypto/tink/internal/f0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Lqs/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqs/g;-><init>(I)V

    sput-object v0, Lqs/g;->b:Lqs/g;

    new-instance v0, Lqs/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqs/g;-><init>(I)V

    sput-object v0, Lqs/g;->c:Lqs/g;

    new-instance v0, Los/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Los/a;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/j;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lqs/g;->d:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqs/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lqs/g;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lfs/j;

    return-object v0

    :pswitch_0
    const-class v0, Lqs/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lqs/g;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lfs/j;

    return-object v0

    :pswitch_0
    const-class v0, Lqs/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(La33/d;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqs/g;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lqs/n;

    invoke-direct {v0, p1}, Lqs/n;-><init>(La33/d;)V

    return-object v0

    :pswitch_0
    invoke-virtual {p1}, La33/d;->u()Lcom/google/crypto/tink/internal/j0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, La33/d;->o()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/j0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/j0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqs/e;

    goto :goto_0

    :cond_1
    new-instance p1, Lqs/f;

    invoke-direct {p1}, Lqs/f;-><init>()V

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "no primary in primitive set"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
