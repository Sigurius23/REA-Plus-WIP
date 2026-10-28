.class public abstract Lcom/squareup/wire/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final Companion:Lcom/squareup/wire/k;

.field private static final serialVersionUID:J


# instance fields
.field private final transient adapter:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field private transient cachedSerializedSize:I

.field protected transient hashCode:I

.field private final transient unknownFields:Lne3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/squareup/wire/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/squareup/wire/l;->Companion:Lcom/squareup/wire/k;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/wire/q;Lne3/l;)V
    .locals 1

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/squareup/wire/l;->adapter:Lcom/squareup/wire/q;

    iput-object p2, p0, Lcom/squareup/wire/l;->unknownFields:Lne3/l;

    return-void
.end method


# virtual methods
.method public final adapter()Lcom/squareup/wire/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/wire/q;"
        }
    .end annotation

    iget-object v0, p0, Lcom/squareup/wire/l;->adapter:Lcom/squareup/wire/q;

    return-object v0
.end method

.method public final encode(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/squareup/wire/l;->adapter:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1, p0}, Lcom/squareup/wire/q;->encode(Ljava/io/OutputStream;Ljava/lang/Object;)V

    return-void
.end method

.method public final encode(Lne3/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/squareup/wire/l;->adapter:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1, p0}, Lcom/squareup/wire/q;->encode(Lne3/i;Ljava/lang/Object;)V

    return-void
.end method

.method public final encode()[B
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/squareup/wire/l;->adapter:Lcom/squareup/wire/q;

    invoke-virtual {v0, p0}, Lcom/squareup/wire/q;->encode(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method

.method public final encodeByteString()Lne3/l;
    .locals 1

    iget-object v0, p0, Lcom/squareup/wire/l;->adapter:Lcom/squareup/wire/q;

    invoke-virtual {v0, p0}, Lcom/squareup/wire/q;->encodeByteString(Ljava/lang/Object;)Lne3/l;

    move-result-object v0

    return-object v0
.end method

.method public final getCachedSerializedSize$wire_runtime()I
    .locals 1

    iget v0, p0, Lcom/squareup/wire/l;->cachedSerializedSize:I

    return v0
.end method

.method public abstract newBuilder()Lcom/squareup/wire/j;
.end method

.method public final setCachedSerializedSize$wire_runtime(I)V
    .locals 0

    iput p1, p0, Lcom/squareup/wire/l;->cachedSerializedSize:I

    return-void
.end method

.method public final unknownFields()Lne3/l;
    .locals 1

    iget-object v0, p0, Lcom/squareup/wire/l;->unknownFields:Lne3/l;

    if-nez v0, :cond_0

    sget-object v0, Lne3/l;->E:Lne3/l;

    :cond_0
    return-object v0
.end method

.method public final withoutUnknownFields()Lcom/squareup/wire/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/wire/l;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/squareup/wire/l;->newBuilder()Lcom/squareup/wire/j;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lne3/l;->E:Lne3/l;

    iput-object v1, v0, Lcom/squareup/wire/j;->a:Lne3/l;

    iget-object v1, v0, Lcom/squareup/wire/j;->b:Lne3/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lne3/h;->b()V

    iput-object v2, v0, Lcom/squareup/wire/j;->b:Lne3/h;

    :cond_0
    iput-object v2, v0, Lcom/squareup/wire/j;->c:Lcom/squareup/wire/s;

    invoke-virtual {v0}, Lcom/squareup/wire/j;->a()Lcom/squareup/wire/l;

    move-result-object v0

    return-object v0
.end method

.method public final writeReplace()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    new-instance v0, Lcom/squareup/wire/m;

    invoke-virtual {p0}, Lcom/squareup/wire/l;->encode()[B

    move-result-object v1

    const-string v2, "bytes"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method
