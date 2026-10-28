.class public final Lrg3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final y:Lud3/h0;


# instance fields
.field public final w:Lcom/google/gson/Gson;

.field public final x:Lcom/google/gson/TypeAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    sput-object v0, Lrg3/b;->y:Lud3/h0;

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg3/b;->w:Lcom/google/gson/Gson;

    iput-object p2, p0, Lrg3/b;->x:Lcom/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, La6/i1;

    invoke-direct {v2, v0}, La6/i1;-><init>(Lne3/h;)V

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    iget-object v2, p0, Lrg3/b;->w:Lcom/google/gson/Gson;

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->newJsonWriter(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    iget-object v2, p0, Lrg3/b;->x:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v2, v1, p1}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/gson/stream/JsonWriter;->close()V

    iget-wide v1, v0, Lne3/h;->x:J

    invoke-virtual {v0, v1, v2}, Lne3/h;->m0(J)Lne3/l;

    move-result-object p1

    sget-object v0, Lrg3/b;->y:Lud3/h0;

    invoke-static {v0, p1}, Lud3/v0;->create(Lud3/h0;Lne3/l;)Lud3/v0;

    move-result-object p1

    return-object p1
.end method
