.class public abstract Lcom/google/crypto/tink/shaded/protobuf/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/shaded/protobuf/q;

.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/r;->a:Lcom/google/crypto/tink/shaded/protobuf/q;

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/r;->b:Lcom/google/crypto/tink/shaded/protobuf/q;

    return-void
.end method
