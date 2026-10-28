.class public final Ltt0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0015\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ)\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Ltt0/c;",
        "",
        "<init>",
        "()V",
        "Ljava/util/zip/CRC32;",
        "crc",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "Ll83/a0;",
        "e",
        "(Ljava/util/zip/CRC32;Ljava/nio/ByteBuffer;)V",
        "data",
        "",
        "offset",
        "length",
        "d",
        "(Ljava/nio/ByteBuffer;II)Ljava/lang/Integer;",
        "",
        "b",
        "([BII)I",
        "",
        "c",
        "(Ljava/nio/ByteBuffer;)J",
        "",
        "a",
        "(Ljava/nio/ByteBuffer;J)Z",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "[B",
        "TABLE_CRC_8",
        "",
        "[I",
        "TABLE_CRC_16",
        "connectivity-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ltt0/c;

.field private static final b:Ltr2/n;

.field private static final c:[B

.field private static final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltt0/c;

    invoke-direct {v0}, Ltt0/c;-><init>()V

    sput-object v0, Ltt0/c;->a:Ltt0/c;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "CrcUtils"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Ltt0/c;->b:Ltr2/n;

    const/16 v0, 0x100

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Ltt0/c;->c:[B

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Ltt0/c;->d:[I

    return-void

    :array_0
    .array-data 1
        0x0t
        0x7t
        0xet
        0x9t
        0x1ct
        0x1bt
        0x12t
        0x15t
        0x38t
        0x3ft
        0x36t
        0x31t
        0x24t
        0x23t
        0x2at
        0x2dt
        0x70t
        0x77t
        0x7et
        0x79t
        0x6ct
        0x6bt
        0x62t
        0x65t
        0x48t
        0x4ft
        0x46t
        0x41t
        0x54t
        0x53t
        0x5at
        0x5dt
        -0x20t
        -0x19t
        -0x12t
        -0x17t
        -0x4t
        -0x5t
        -0xet
        -0xbt
        -0x28t
        -0x21t
        -0x2at
        -0x2ft
        -0x3ct
        -0x3dt
        -0x36t
        -0x33t
        -0x70t
        -0x69t
        -0x62t
        -0x67t
        -0x74t
        -0x75t
        -0x7et
        -0x7bt
        -0x58t
        -0x51t
        -0x5at
        -0x5ft
        -0x4ct
        -0x4dt
        -0x46t
        -0x43t
        -0x39t
        -0x40t
        -0x37t
        -0x32t
        -0x25t
        -0x24t
        -0x2bt
        -0x2et
        -0x1t
        -0x8t
        -0xft
        -0xat
        -0x1dt
        -0x1ct
        -0x13t
        -0x16t
        -0x49t
        -0x50t
        -0x47t
        -0x42t
        -0x55t
        -0x54t
        -0x5bt
        -0x5et
        -0x71t
        -0x78t
        -0x7ft
        -0x7at
        -0x6dt
        -0x6ct
        -0x63t
        -0x66t
        0x27t
        0x20t
        0x29t
        0x2et
        0x3bt
        0x3ct
        0x35t
        0x32t
        0x1ft
        0x18t
        0x11t
        0x16t
        0x3t
        0x4t
        0xdt
        0xat
        0x57t
        0x50t
        0x59t
        0x5et
        0x4bt
        0x4ct
        0x45t
        0x42t
        0x6ft
        0x68t
        0x61t
        0x66t
        0x73t
        0x74t
        0x7dt
        0x7at
        -0x77t
        -0x72t
        -0x79t
        -0x80t
        -0x6bt
        -0x6et
        -0x65t
        -0x64t
        -0x4ft
        -0x4at
        -0x41t
        -0x48t
        -0x53t
        -0x56t
        -0x5dt
        -0x5ct
        -0x7t
        -0x2t
        -0x9t
        -0x10t
        -0x1bt
        -0x1et
        -0x15t
        -0x14t
        -0x3ft
        -0x3at
        -0x31t
        -0x38t
        -0x23t
        -0x26t
        -0x2dt
        -0x2ct
        0x69t
        0x6et
        0x67t
        0x60t
        0x75t
        0x72t
        0x7bt
        0x7ct
        0x51t
        0x56t
        0x5ft
        0x58t
        0x4dt
        0x4at
        0x43t
        0x44t
        0x19t
        0x1et
        0x17t
        0x10t
        0x5t
        0x2t
        0xbt
        0xct
        0x21t
        0x26t
        0x2ft
        0x28t
        0x3dt
        0x3at
        0x33t
        0x34t
        0x4et
        0x49t
        0x40t
        0x47t
        0x52t
        0x55t
        0x5ct
        0x5bt
        0x76t
        0x71t
        0x78t
        0x7ft
        0x6at
        0x6dt
        0x64t
        0x63t
        0x3et
        0x39t
        0x30t
        0x37t
        0x22t
        0x25t
        0x2ct
        0x2bt
        0x6t
        0x1t
        0x8t
        0xft
        0x1at
        0x1dt
        0x14t
        0x13t
        -0x52t
        -0x57t
        -0x60t
        -0x59t
        -0x4et
        -0x4bt
        -0x44t
        -0x45t
        -0x6at
        -0x6ft
        -0x68t
        -0x61t
        -0x76t
        -0x73t
        -0x7ct
        -0x7dt
        -0x22t
        -0x27t
        -0x30t
        -0x29t
        -0x3et
        -0x3bt
        -0x34t
        -0x35t
        -0x1at
        -0x1ft
        -0x18t
        -0x11t
        -0x6t
        -0x3t
        -0xct
        -0xdt
    .end array-data

    :array_1
    .array-data 4
        0x0
        0xc0c1
        0xc181
        0x140
        0xc301
        0x3c0
        0x280
        0xc241
        0xc601
        0x6c0
        0x780
        0xc741
        0x500
        0xc5c1
        0xc481
        0x440
        0xcc01
        0xcc0
        0xd80
        0xcd41
        0xf00
        0xcfc1
        0xce81
        0xe40
        0xa00
        0xcac1
        0xcb81
        0xb40
        0xc901
        0x9c0
        0x880
        0xc841
        0xd801
        0x18c0
        0x1980
        0xd941
        0x1b00
        0xdbc1
        0xda81
        0x1a40
        0x1e00
        0xdec1
        0xdf81
        0x1f40
        0xdd01
        0x1dc0
        0x1c80
        0xdc41
        0x1400
        0xd4c1
        0xd581
        0x1540
        0xd701
        0x17c0
        0x1680
        0xd641
        0xd201
        0x12c0
        0x1380
        0xd341
        0x1100
        0xd1c1
        0xd081
        0x1040
        0xf001
        0x30c0
        0x3180
        0xf141
        0x3300
        0xf3c1
        0xf281
        0x3240
        0x3600
        0xf6c1
        0xf781
        0x3740
        0xf501
        0x35c0
        0x3480
        0xf441
        0x3c00
        0xfcc1
        0xfd81
        0x3d40
        0xff01
        0x3fc0
        0x3e80
        0xfe41
        0xfa01
        0x3ac0
        0x3b80
        0xfb41
        0x3900
        0xf9c1
        0xf881
        0x3840
        0x2800
        0xe8c1
        0xe981
        0x2940
        0xeb01
        0x2bc0
        0x2a80
        0xea41
        0xee01
        0x2ec0
        0x2f80
        0xef41
        0x2d00
        0xedc1
        0xec81
        0x2c40
        0xe401
        0x24c0
        0x2580
        0xe541
        0x2700
        0xe7c1
        0xe681
        0x2640
        0x2200
        0xe2c1
        0xe381
        0x2340
        0xe101
        0x21c0
        0x2080
        0xe041
        0xa001
        0x60c0
        0x6180
        0xa141
        0x6300
        0xa3c1
        0xa281
        0x6240
        0x6600
        0xa6c1
        0xa781
        0x6740
        0xa501
        0x65c0
        0x6480
        0xa441
        0x6c00
        0xacc1
        0xad81
        0x6d40
        0xaf01
        0x6fc0
        0x6e80
        0xae41
        0xaa01
        0x6ac0
        0x6b80
        0xab41
        0x6900
        0xa9c1
        0xa881
        0x6840
        0x7800
        0xb8c1
        0xb981
        0x7940
        0xbb01
        0x7bc0
        0x7a80
        0xba41
        0xbe01
        0x7ec0
        0x7f80
        0xbf41
        0x7d00
        0xbdc1
        0xbc81
        0x7c40
        0xb401
        0x74c0
        0x7580
        0xb541
        0x7700
        0xb7c1
        0xb681
        0x7640
        0x7200
        0xb2c1
        0xb381
        0x7340
        0xb101
        0x71c0
        0x7080
        0xb041
        0x5000
        0x90c1
        0x9181
        0x5140
        0x9301
        0x53c0
        0x5280
        0x9241
        0x9601
        0x56c0
        0x5780
        0x9741
        0x5500
        0x95c1
        0x9481
        0x5440
        0x9c01
        0x5cc0
        0x5d80
        0x9d41
        0x5f00
        0x9fc1
        0x9e81
        0x5e40
        0x5a00
        0x9ac1
        0x9b81
        0x5b40
        0x9901
        0x59c0
        0x5880
        0x9841
        0x8801
        0x48c0
        0x4980
        0x8941
        0x4b00
        0x8bc1
        0x8a81
        0x4a40
        0x4e00
        0x8ec1
        0x8f81
        0x4f40
        0x8d01
        0x4dc0
        0x4c80
        0x8c41
        0x4400
        0x84c1
        0x8581
        0x4540
        0x8701
        0x47c0
        0x4680
        0x8641
        0x8201
        0x42c0
        0x4380
        0x8341
        0x4100
        0x81c1
        0x8081
        0x4040
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final e(Ljava/util/zip/CRC32;Ljava/nio/ByteBuffer;)V
    .locals 3

    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v1

    sub-int/2addr v1, v0

    if-gtz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p2

    add-int/2addr p2, v0

    invoke-virtual {p1, v2, p2, v1}, Ljava/util/zip/CRC32;->update([BII)V

    return-void

    :cond_1
    new-array v0, v1, [B

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2, v1}, Ljava/util/zip/CRC32;->update([BII)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;J)Z
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ltt0/c;->c(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    sget-object p1, Ltt0/c;->b:Ltr2/n;

    const-string v2, "CRC32 computed "

    const-string v3, " but expected "

    invoke-static {v0, v1, v2, v3}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    new-array v0, p3, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return p3
.end method

.method public final b([BII)I
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr p3, p2

    const v0, 0xffff

    :goto_0
    if-ge p2, p3, :cond_0

    shr-int/lit8 v1, v0, 0x8

    sget-object v2, Ltt0/c;->d:[I

    aget-byte v3, p1, p2

    and-int/lit16 v3, v3, 0xff

    xor-int/2addr v0, v3

    and-int/lit16 v0, v0, 0xff

    aget v0, v2, v0

    xor-int/2addr v0, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Luk0/b;->a:Luk0/b;

    int-to-short p2, v0

    invoke-virtual {p1, p2}, Luk0/b;->e(S)I

    move-result p1

    return p1
.end method

.method public final c(Ljava/nio/ByteBuffer;)J
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    invoke-direct {p0, v0, p1}, Ltt0/c;->e(Ljava/util/zip/CRC32;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Ljava/nio/ByteBuffer;II)Ljava/lang/Integer;
    .locals 3

    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    sub-int/2addr v0, p2

    if-ge v0, p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_1

    add-int v2, p2, v0

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    sget-object v2, Ltt0/c;->c:[B

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    aget-byte v1, v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method
