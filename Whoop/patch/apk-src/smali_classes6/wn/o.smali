.class public final Lwn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/d0;


# static fields
.field public static final A0:Ljava/util/regex/Pattern;

.field public static final B0:Ljava/util/regex/Pattern;

.field public static final E:Ljava/util/regex/Pattern;

.field public static final F:Ljava/util/regex/Pattern;

.field public static final G:Ljava/util/regex/Pattern;

.field public static final H:Ljava/util/regex/Pattern;

.field public static final I:Ljava/util/regex/Pattern;

.field public static final J:Ljava/util/regex/Pattern;

.field public static final K:Ljava/util/regex/Pattern;

.field public static final L:Ljava/util/regex/Pattern;

.field public static final M:Ljava/util/regex/Pattern;

.field public static final N:Ljava/util/regex/Pattern;

.field public static final O:Ljava/util/regex/Pattern;

.field public static final P:Ljava/util/regex/Pattern;

.field public static final Q:Ljava/util/regex/Pattern;

.field public static final R:Ljava/util/regex/Pattern;

.field public static final S:Ljava/util/regex/Pattern;

.field public static final T:Ljava/util/regex/Pattern;

.field public static final U:Ljava/util/regex/Pattern;

.field public static final V:Ljava/util/regex/Pattern;

.field public static final W:Ljava/util/regex/Pattern;

.field public static final X:Ljava/util/regex/Pattern;

.field public static final Y:Ljava/util/regex/Pattern;

.field public static final Z:Ljava/util/regex/Pattern;

.field public static final a0:Ljava/util/regex/Pattern;

.field public static final b0:Ljava/util/regex/Pattern;

.field public static final c0:Ljava/util/regex/Pattern;

.field public static final d0:Ljava/util/regex/Pattern;

.field public static final e0:Ljava/util/regex/Pattern;

.field public static final f0:Ljava/util/regex/Pattern;

.field public static final g0:Ljava/util/regex/Pattern;

.field public static final h0:Ljava/util/regex/Pattern;

.field public static final i0:Ljava/util/regex/Pattern;

.field public static final j0:Ljava/util/regex/Pattern;

.field public static final k0:Ljava/util/regex/Pattern;

.field public static final l0:Ljava/util/regex/Pattern;

.field public static final m0:Ljava/util/regex/Pattern;

.field public static final n0:Ljava/util/regex/Pattern;

.field public static final o0:Ljava/util/regex/Pattern;

.field public static final p0:Ljava/util/regex/Pattern;

.field public static final q0:Ljava/util/regex/Pattern;

.field public static final r0:Ljava/util/regex/Pattern;

.field public static final s0:Ljava/util/regex/Pattern;

.field public static final t0:Ljava/util/regex/Pattern;

.field public static final u0:Ljava/util/regex/Pattern;

.field public static final v0:Ljava/util/regex/Pattern;

.field public static final w0:Ljava/util/regex/Pattern;

.field public static final x0:Ljava/util/regex/Pattern;

.field public static final y:Ljava/util/regex/Pattern;

.field public static final y0:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;

.field public static final z0:Ljava/util/regex/Pattern;


# instance fields
.field public final w:Lwn/m;

.field public final x:Lwn/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->y:Ljava/util/regex/Pattern;

    const-string v0, "VIDEO=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->z:Ljava/util/regex/Pattern;

    const-string v0, "AUDIO=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->E:Ljava/util/regex/Pattern;

    const-string v0, "SUBTITLES=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->F:Ljava/util/regex/Pattern;

    const-string v0, "CLOSED-CAPTIONS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->G:Ljava/util/regex/Pattern;

    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->H:Ljava/util/regex/Pattern;

    const-string v0, "CHANNELS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->I:Ljava/util/regex/Pattern;

    const-string v0, "CODECS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->J:Ljava/util/regex/Pattern;

    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->K:Ljava/util/regex/Pattern;

    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->L:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->M:Ljava/util/regex/Pattern;

    const-string v0, "DURATION=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->N:Ljava/util/regex/Pattern;

    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->O:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->P:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->Q:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->R:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-DATERANGES"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->S:Ljava/util/regex/Pattern;

    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->T:Ljava/util/regex/Pattern;

    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->U:Ljava/util/regex/Pattern;

    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->V:Ljava/util/regex/Pattern;

    const-string v0, "CAN-BLOCK-RELOAD"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->W:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->X:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->Y:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->Z:Ljava/util/regex/Pattern;

    const-string v0, "LAST-MSN=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->a0:Ljava/util/regex/Pattern;

    const-string v0, "LAST-PART=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->b0:Ljava/util/regex/Pattern;

    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->c0:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->d0:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->e0:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->f0:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->g0:Ljava/util/regex/Pattern;

    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->h0:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMAT=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->i0:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMATVERSIONS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->j0:Ljava/util/regex/Pattern;

    const-string v0, "URI=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->k0:Ljava/util/regex/Pattern;

    const-string v0, "IV=([^,.*]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->l0:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->m0:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(PART|MAP)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->n0:Ljava/util/regex/Pattern;

    const-string v0, "LANGUAGE=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->o0:Ljava/util/regex/Pattern;

    const-string v0, "NAME=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->p0:Ljava/util/regex/Pattern;

    const-string v0, "GROUP-ID=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->q0:Ljava/util/regex/Pattern;

    const-string v0, "CHARACTERISTICS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->r0:Ljava/util/regex/Pattern;

    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->s0:Ljava/util/regex/Pattern;

    const-string v0, "AUTOSELECT"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->t0:Ljava/util/regex/Pattern;

    const-string v0, "DEFAULT"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->u0:Ljava/util/regex/Pattern;

    const-string v0, "FORCED"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->v0:Ljava/util/regex/Pattern;

    const-string v0, "INDEPENDENT"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->w0:Ljava/util/regex/Pattern;

    const-string v0, "GAP"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->x0:Ljava/util/regex/Pattern;

    const-string v0, "PRECISE"

    invoke-static {v0}, Lwn/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->y0:Ljava/util/regex/Pattern;

    const-string v0, "VALUE=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->z0:Ljava/util/regex/Pattern;

    const-string v0, "IMPORT=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->A0:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lwn/o;->B0:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lwn/m;Lwn/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/o;->w:Lwn/m;

    iput-object p2, p0, Lwn/o;->x:Lwn/j;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "=(NO|YES)"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;[Lvm/b;)Lvm/c;
    .locals 7

    array-length v0, p1

    new-array v0, v0, [Lvm/b;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object v2, p1, v1

    new-instance v3, Lvm/b;

    iget-object v4, v2, Lvm/b;->x:Ljava/util/UUID;

    iget-object v5, v2, Lvm/b;->y:Ljava/lang/String;

    iget-object v2, v2, Lvm/b;->z:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v2, v6}, Lvm/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lvm/c;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1, v0}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    return-object p1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lvm/b;
    .locals 8

    sget-object v0, Lwn/o;->j0:Ljava/util/regex/Pattern;

    const-string v1, "1"

    invoke-static {p0, v0, v1, p2}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x2c

    const-string v5, "video/mp4"

    sget-object v6, Lwn/o;->k0:Ljava/util/regex/Pattern;

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    invoke-static {p0, v6, p2}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lvm/b;

    sget-object p2, Lrm/g;->b:Ljava/util/UUID;

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    invoke-direct {p1, p2, v7, v5, p0}, Lvm/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object p1

    :cond_0
    const-string v2, "com.widevine"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p1, Lvm/b;

    sget-object p2, Lrm/g;->b:Ljava/util/UUID;

    sget v0, Llo/y;->a:I

    sget-object v0, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-string v0, "hls"

    invoke-direct {p1, p2, v7, v0, p0}, Lvm/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object p1

    :cond_1
    const-string v2, "com.microsoft.playready"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0, v6, p2}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    sget-object p1, Lrm/g;->c:Ljava/util/UUID;

    invoke-static {p1, p0}, Ldn/k;->a(Ljava/util/UUID;[B)[B

    move-result-object p0

    new-instance p2, Lvm/b;

    invoke-direct {p2, p1, v7, v5, p0}, Lvm/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object p2

    :cond_2
    return-object v7
.end method

.method public static e(Lwn/m;Lwn/j;Lq30/w0;Ljava/lang/String;)Lwn/j;
    .locals 110

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, Lwn/n;->c:Z

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Lwn/i;

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v12, 0x0

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v9 .. v17}, Lwn/i;-><init>(JZJJZ)V

    new-instance v10, Ljava/util/TreeMap;

    invoke-direct {v10}, Ljava/util/TreeMap;-><init>()V

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v18, 0x0

    const-string v14, ""

    const-wide/16 v20, -0x1

    move/from16 v23, v2

    move-object/from16 v67, v14

    move-wide/from16 v42, v16

    move-wide/from16 v70, v42

    move-wide/from16 v27, v18

    move-wide/from16 v48, v27

    move-wide/from16 v52, v48

    move-wide/from16 v56, v52

    move-wide/from16 v61, v56

    move-wide/from16 v65, v61

    move-wide/from16 v68, v65

    move-wide/from16 v72, v68

    move-wide/from16 v50, v20

    move-wide/from16 v74, v50

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const/16 v37, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v60, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    move-wide/from16 v19, v70

    move-wide/from16 v21, v19

    move-wide/from16 v16, v72

    const/16 v18, 0x1

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lq30/w0;->w()Z

    move-result v30

    if-eqz v30, :cond_58

    invoke-virtual/range {p2 .. p2}, Lq30/w0;->z()Ljava/lang/String;

    move-result-object v12

    const-string v13, "#EXT"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v13, "#EXT-X-PLAYLIST-TYPE"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    move/from16 v77, v2

    if-eqz v13, :cond_3

    sget-object v13, Lwn/o;->Q:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "VOD"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    const-string v13, "EVENT"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    const/4 v15, 0x2

    :cond_2
    :goto_1
    move/from16 v2, v77

    goto :goto_0

    :cond_3
    const-string v13, "#EXT-X-I-FRAMES-ONLY"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    move/from16 v2, v77

    const/16 v63, 0x1

    goto :goto_0

    :cond_4
    const-string v13, "#EXT-X-START"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    const-wide v31, 0x412e848000000000L    # 1000000.0

    if-eqz v13, :cond_5

    sget-object v2, Lwn/o;->c0:Ljava/util/regex/Pattern;

    sget-object v13, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v13}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v34

    move-object v13, v8

    move-object/from16 v78, v9

    mul-double v8, v34, v31

    double-to-long v8, v8

    sget-object v2, Lwn/o;->y0:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v2

    move-wide/from16 v42, v8

    move-object v8, v13

    :goto_2
    move-object/from16 v9, v78

    goto :goto_0

    :cond_5
    move-object v13, v8

    move-object/from16 v78, v9

    const-string v8, "#EXT-X-SERVER-CONTROL"

    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    sget-object v2, Lwn/o;->R:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v8

    const-wide/high16 v34, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v2, v8, v34

    if-nez v2, :cond_6

    move-wide/from16 v79, v70

    goto :goto_3

    :cond_6
    mul-double v8, v8, v31

    double-to-long v8, v8

    move-wide/from16 v79, v8

    :goto_3
    sget-object v2, Lwn/o;->S:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v81

    sget-object v2, Lwn/o;->U:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v8

    cmpl-double v2, v8, v34

    if-nez v2, :cond_7

    move-wide/from16 v82, v70

    goto :goto_4

    :cond_7
    mul-double v8, v8, v31

    double-to-long v8, v8

    move-wide/from16 v82, v8

    :goto_4
    sget-object v2, Lwn/o;->V:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v8

    cmpl-double v2, v8, v34

    if-nez v2, :cond_8

    move-wide/from16 v84, v70

    goto :goto_5

    :cond_8
    mul-double v8, v8, v31

    double-to-long v8, v8

    move-wide/from16 v84, v8

    :goto_5
    sget-object v2, Lwn/o;->W:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v86

    new-instance v78, Lwn/i;

    invoke-direct/range {v78 .. v86}, Lwn/i;-><init>(JZJJZ)V

    :goto_6
    move-object v8, v13

    move/from16 v2, v77

    goto :goto_2

    :cond_9
    const-string v8, "#EXT-X-PART-INF"

    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    sget-object v2, Lwn/o;->O:Ljava/util/regex/Pattern;

    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v8}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    mul-double v8, v8, v31

    double-to-long v8, v8

    move-wide/from16 v21, v8

    goto :goto_6

    :cond_a
    const-string v8, "#EXT-X-MAP"

    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    sget-object v9, Lwn/o;->e0:Ljava/util/regex/Pattern;

    const-string v2, "@"

    move/from16 v35, v8

    sget-object v8, Lwn/o;->k0:Ljava/util/regex/Pattern;

    if-eqz v35, :cond_10

    invoke-static {v12, v8, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v31

    const/4 v8, 0x0

    invoke-static {v12, v9, v8, v3}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_b

    sget v8, Llo/y;->a:I

    const/4 v8, -0x1

    invoke-virtual {v9, v2, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    aget-object v8, v2, v45

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v50

    array-length v8, v2

    const/4 v9, 0x1

    if-le v8, v9, :cond_b

    aget-object v2, v2, v9

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v56

    :cond_b
    move-wide/from16 v34, v50

    cmp-long v2, v34, v74

    if-nez v2, :cond_c

    move-wide/from16 v56, v72

    :cond_c
    if-eqz v33, :cond_e

    if-eqz v37, :cond_d

    goto :goto_7

    :cond_d
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    invoke-static {v0}, Lcom/google/android/exoplayer2/ParserException;->b(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_e
    :goto_7
    new-instance v30, Lwn/g;

    move-object/from16 v36, v33

    move-wide/from16 v32, v56

    invoke-direct/range {v30 .. v37}, Lwn/g;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v33, v36

    move-object/from16 v79, v37

    if-eqz v2, :cond_f

    add-long v56, v56, v34

    :cond_f
    move-object v8, v13

    move-object/from16 v25, v30

    move-wide/from16 v50, v74

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    goto/16 :goto_0

    :cond_10
    move-object/from16 v80, v13

    move-object/from16 v79, v37

    const-string v13, "#EXT-X-TARGETDURATION"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    move-object/from16 v82, v6

    move-object/from16 v81, v7

    const-wide/32 v6, 0xf4240

    if-eqz v13, :cond_11

    sget-object v2, Lwn/o;->M:Ljava/util/regex/Pattern;

    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v8}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    int-to-long v8, v2

    mul-long v19, v8, v6

    :goto_8
    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    :goto_9
    move-object/from16 v8, v80

    move-object/from16 v7, v81

    move-object/from16 v6, v82

    goto/16 :goto_0

    :cond_11
    const-string v13, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    sget-object v2, Lwn/o;->X:Ljava/util/regex/Pattern;

    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v6}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v52

    move-wide/from16 v16, v52

    goto :goto_8

    :cond_12
    const-string v13, "#EXT-X-VERSION"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_13

    sget-object v2, Lwn/o;->P:Ljava/util/regex/Pattern;

    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v6}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v18

    goto :goto_8

    :cond_13
    const-string v13, "#EXT-X-DEFINE"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_16

    sget-object v2, Lwn/o;->A0:Ljava/util/regex/Pattern;

    const/4 v8, 0x0

    invoke-static {v12, v2, v8, v3}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_14

    iget-object v6, v0, Lwn/m;->l:Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_15

    invoke-virtual {v3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_14
    sget-object v2, Lwn/o;->p0:Ljava/util/regex/Pattern;

    invoke-static {v12, v2, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lwn/o;->z0:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    :goto_a
    move-object/from16 v6, v25

    move-wide/from16 v30, v27

    move-object/from16 v34, v33

    move-wide/from16 v38, v50

    move-object/from16 v13, v60

    :goto_b
    move/from16 v40, v64

    move-object/from16 v27, v67

    move-object/from16 v0, v81

    :goto_c
    move-object/from16 v7, v82

    goto/16 :goto_2f

    :cond_16
    const-string v13, "#EXTINF"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_17

    sget-object v2, Lwn/o;->Y:Ljava/util/regex/Pattern;

    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v8}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    new-instance v8, Ljava/math/BigDecimal;

    invoke-direct {v8, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/math/BigDecimal;

    invoke-direct {v2, v6, v7}, Ljava/math/BigDecimal;-><init>(J)V

    invoke-virtual {v8, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v65

    sget-object v2, Lwn/o;->Z:Ljava/util/regex/Pattern;

    invoke-static {v12, v2, v14, v3}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v67

    goto/16 :goto_8

    :cond_17
    const-string v6, "#EXT-X-SKIP"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    const-wide/16 v35, 0x1

    if-eqz v6, :cond_20

    sget-object v2, Lwn/o;->T:Ljava/util/regex/Pattern;

    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v2, v6}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-eqz v1, :cond_18

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_18

    const/4 v6, 0x1

    goto :goto_d

    :cond_18
    move/from16 v6, v45

    :goto_d
    invoke-static {v6}, Llo/a;->i(Z)V

    sget v6, Llo/y;->a:I

    iget-wide v6, v1, Lwn/j;->k:J

    iget-object v8, v1, Lwn/j;->r:Lzr/g0;

    sub-long v6, v16, v6

    long-to-int v6, v6

    add-int/2addr v2, v6

    if-ltz v6, :cond_1f

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v7

    if-gt v2, v7, :cond_1f

    move-wide/from16 v90, v61

    move-object/from16 v37, v79

    :goto_e
    if-ge v6, v2, :cond_1e

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn/g;

    iget-wide v12, v1, Lwn/j;->k:J

    cmp-long v9, v16, v12

    if-eqz v9, :cond_1a

    iget v9, v1, Lwn/j;->j:I

    sub-int v9, v9, v47

    iget v12, v7, Lwn/h;->z:I

    add-int v97, v9, v12

    iget-object v9, v7, Lwn/g;->M:Lzr/g0;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move/from16 v13, v45

    move-wide/from16 v98, v90

    :goto_f
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_19

    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/e;

    new-instance v92, Lwn/e;

    iget-object v1, v0, Lwn/h;->w:Ljava/lang/String;

    move-object/from16 v93, v1

    iget-object v1, v0, Lwn/h;->x:Lwn/g;

    move-object/from16 v94, v1

    move/from16 v30, v2

    iget-wide v1, v0, Lwn/h;->y:J

    move-wide/from16 v95, v1

    iget-object v1, v0, Lwn/h;->F:Lvm/c;

    iget-object v2, v0, Lwn/h;->G:Ljava/lang/String;

    move-object/from16 v100, v1

    iget-object v1, v0, Lwn/h;->H:Ljava/lang/String;

    move-object/from16 v102, v1

    move-object/from16 v101, v2

    iget-wide v1, v0, Lwn/h;->I:J

    move-wide/from16 v103, v1

    iget-wide v1, v0, Lwn/h;->J:J

    move-wide/from16 v105, v1

    iget-boolean v1, v0, Lwn/h;->K:Z

    iget-boolean v2, v0, Lwn/e;->L:Z

    move/from16 v107, v1

    iget-boolean v1, v0, Lwn/e;->M:Z

    move/from16 v109, v1

    move/from16 v108, v2

    invoke-direct/range {v92 .. v109}, Lwn/e;-><init>(Ljava/lang/String;Lwn/g;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v1, v92

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v0, v0, Lwn/h;->y:J

    add-long v98, v98, v0

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p1

    move/from16 v2, v30

    goto :goto_f

    :cond_19
    move/from16 v30, v2

    new-instance v83, Lwn/g;

    iget-object v0, v7, Lwn/h;->w:Ljava/lang/String;

    iget-object v1, v7, Lwn/h;->x:Lwn/g;

    iget-object v2, v7, Lwn/g;->L:Ljava/lang/String;

    move-object/from16 v84, v0

    move-object/from16 v85, v1

    iget-wide v0, v7, Lwn/h;->y:J

    iget-object v9, v7, Lwn/h;->F:Lvm/c;

    iget-object v13, v7, Lwn/h;->G:Ljava/lang/String;

    move-wide/from16 v87, v0

    iget-object v0, v7, Lwn/h;->H:Ljava/lang/String;

    move-object/from16 v94, v0

    iget-wide v0, v7, Lwn/h;->I:J

    move-wide/from16 v95, v0

    iget-wide v0, v7, Lwn/h;->J:J

    iget-boolean v7, v7, Lwn/h;->K:Z

    move-object/from16 v86, v2

    move/from16 v99, v7

    move-object/from16 v92, v9

    move-object/from16 v100, v12

    move-object/from16 v93, v13

    move/from16 v89, v97

    move-wide/from16 v97, v0

    invoke-direct/range {v83 .. v100}, Lwn/g;-><init>(Ljava/lang/String;Lwn/g;Ljava/lang/String;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object/from16 v7, v83

    goto :goto_10

    :cond_1a
    move/from16 v30, v2

    :goto_10
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v0, v7, Lwn/h;->y:J

    iget-object v2, v7, Lwn/h;->H:Ljava/lang/String;

    add-long v90, v90, v0

    iget-wide v0, v7, Lwn/h;->J:J

    cmp-long v9, v0, v74

    if-eqz v9, :cond_1b

    iget-wide v12, v7, Lwn/h;->I:J

    add-long v56, v12, v0

    :cond_1b
    iget v0, v7, Lwn/h;->z:I

    iget-object v1, v7, Lwn/h;->x:Lwn/g;

    iget-object v9, v7, Lwn/h;->F:Lvm/c;

    iget-object v7, v7, Lwn/h;->G:Ljava/lang/String;

    if-eqz v2, :cond_1c

    invoke-static/range {v52 .. v53}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1d

    :cond_1c
    move-object/from16 v37, v2

    :cond_1d
    add-long v52, v52, v35

    add-int/lit8 v6, v6, 0x1

    move/from16 v29, v0

    move-object/from16 v25, v1

    move-object/from16 v33, v7

    move-object/from16 v24, v9

    move/from16 v2, v30

    move-wide/from16 v27, v90

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_e

    :cond_1e
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v8, v80

    move-object/from16 v7, v81

    move-object/from16 v6, v82

    move-wide/from16 v61, v90

    goto/16 :goto_0

    :cond_1f
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser$DeltaUpdateException;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser$DeltaUpdateException;-><init>()V

    throw v0

    :cond_20
    const-string v0, "#EXT-X-KEY"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    sget-object v0, Lwn/o;->h0:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lwn/o;->i0:Ljava/util/regex/Pattern;

    const-string v2, "identity"

    invoke-static {v12, v1, v2, v3}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "NONE"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-virtual {v10}, Ljava/util/TreeMap;->clear()V

    const/16 v24, 0x0

    const/16 v33, 0x0

    const/16 v37, 0x0

    goto :goto_15

    :cond_21
    sget-object v6, Lwn/o;->l0:Ljava/util/regex/Pattern;

    const/4 v7, 0x0

    invoke-static {v12, v6, v7, v3}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    const-string v1, "AES-128"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-static {v12, v8, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v33, v0

    move-object/from16 v37, v6

    goto :goto_15

    :cond_22
    move-object/from16 v37, v6

    :goto_11
    const/16 v33, 0x0

    goto :goto_15

    :cond_23
    move-object/from16 v13, v60

    if-nez v13, :cond_26

    const-string v2, "SAMPLE-AES-CENC"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    const-string v2, "SAMPLE-AES-CTR"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    goto :goto_13

    :cond_24
    const-string v0, "cbcs"

    :goto_12
    move-object/from16 v60, v0

    goto :goto_14

    :cond_25
    :goto_13
    const-string v0, "cenc"

    goto :goto_12

    :cond_26
    move-object/from16 v60, v13

    :goto_14
    invoke-static {v12, v1, v3}, Lwn/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lvm/b;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v10, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v37, v6

    const/16 v24, 0x0

    goto :goto_11

    :goto_15
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v77

    move-object/from16 v9, v78

    goto/16 :goto_9

    :cond_27
    move-object/from16 v13, v60

    const-string v0, "#EXT-X-BYTERANGE"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_29

    sget-object v0, Lwn/o;->d0:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    sget v1, Llo/y;->a:I

    const/4 v8, -0x1

    invoke-virtual {v0, v2, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    aget-object v1, v0, v45

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v50

    array-length v1, v0

    const/4 v6, 0x1

    if-le v1, v6, :cond_28

    aget-object v0, v0, v6

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide/from16 v56, v0

    :cond_28
    :goto_16
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v60, v13

    goto/16 :goto_8

    :cond_29
    const/4 v6, 0x1

    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x3a

    if-eqz v0, :cond_2a

    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v0, v6

    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v47

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v60, v13

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    move-object/from16 v7, v81

    move-object/from16 v6, v82

    const/16 v46, 0x1

    goto/16 :goto_0

    :cond_2a
    const-string v0, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    add-int/lit8 v29, v29, 0x1

    goto :goto_16

    :cond_2b
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_35

    cmp-long v0, v48, v72

    if-nez v0, :cond_34

    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/16 v76, 0x1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Llo/y;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_2d

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "Invalid date/time format: "

    if-eqz v1, :cond_2c

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_17
    const/4 v8, 0x0

    goto :goto_18

    :cond_2c
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_17

    :goto_18
    invoke-static {v8, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_2d
    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2e

    :goto_19
    move/from16 v0, v45

    goto :goto_1a

    :cond_2e
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Z"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    goto :goto_19

    :cond_2f
    const/16 v0, 0xc

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    const-string v6, "-"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_30

    mul-int/lit8 v0, v0, -0x1

    :cond_30
    :goto_1a
    new-instance v2, Ljava/util/GregorianCalendar;

    const-string v6, "GMT"

    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v6

    invoke-direct {v2, v6}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v36

    const/4 v7, 0x2

    invoke-virtual {v1, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v37, v7, -0x1

    const/4 v6, 0x3

    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v38

    const/4 v7, 0x4

    invoke-virtual {v1, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v39

    const/4 v7, 0x5

    invoke-virtual {v1, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v40

    const/4 v7, 0x6

    invoke-virtual {v1, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v41

    move-object/from16 v35, v2

    invoke-virtual/range {v35 .. v41}, Ljava/util/Calendar;->set(IIIIII)V

    const/16 v7, 0x8

    invoke-virtual {v1, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_32

    new-instance v8, Ljava/math/BigDecimal;

    invoke-virtual {v1, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    const-string v9, "0."

    if-eqz v7, :cond_31

    invoke-virtual {v9, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1b

    :cond_31
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v9}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1b
    invoke-direct {v8, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->intValue()I

    move-result v1

    const/16 v6, 0xe

    invoke-virtual {v2, v6, v1}, Ljava/util/Calendar;->set(II)V

    :cond_32
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    if-eqz v0, :cond_33

    const v6, 0xea60

    mul-int/2addr v0, v6

    int-to-long v6, v0

    sub-long/2addr v1, v6

    :cond_33
    invoke-static {v1, v2}, Llo/y;->z(J)J

    move-result-wide v0

    sub-long v48, v0, v61

    goto/16 :goto_16

    :cond_34
    move-object/from16 v6, v25

    move-wide/from16 v30, v27

    move-object/from16 v34, v33

    move-wide/from16 v38, v50

    goto/16 :goto_b

    :cond_35
    const-string v0, "#EXT-X-GAP"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v60, v13

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    move-object/from16 v7, v81

    move-object/from16 v6, v82

    const/16 v64, 0x1

    goto/16 :goto_0

    :cond_36
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v60, v13

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    move-object/from16 v7, v81

    move-object/from16 v6, v82

    const/16 v23, 0x1

    goto/16 :goto_0

    :cond_37
    const-string v0, "#EXT-X-ENDLIST"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v60, v13

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    move-object/from16 v7, v81

    move-object/from16 v6, v82

    const/16 v44, 0x1

    goto/16 :goto_0

    :cond_38
    const-string v0, "#EXT-X-RENDITION-REPORT"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3a

    sget-object v0, Lwn/o;->a0:Ljava/util/regex/Pattern;

    invoke-static {v12, v0}, Lwn/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v0

    sget-object v2, Lwn/o;->b0:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_39

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_1c

    :cond_39
    const/4 v2, -0x1

    :goto_1c
    invoke-static {v12, v8, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p3

    invoke-static {v7, v6}, Llo/a;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    new-instance v8, Lwn/f;

    invoke-direct {v8, v6, v0, v1, v2}, Lwn/f;-><init>(Landroid/net/Uri;JI)V

    move-object/from16 v0, v81

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1d
    move-object/from16 v6, v25

    move-wide/from16 v30, v27

    move-object/from16 v34, v33

    move-wide/from16 v38, v50

    move/from16 v40, v64

    move-object/from16 v27, v67

    goto/16 :goto_c

    :cond_3a
    move-object/from16 v7, p3

    move-object/from16 v0, v81

    const-string v1, "#EXT-X-PRELOAD-HINT"

    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_44

    if-eqz v11, :cond_3b

    :goto_1e
    goto :goto_1d

    :cond_3b
    sget-object v1, Lwn/o;->n0:Ljava/util/regex/Pattern;

    invoke-static {v12, v1, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PART"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    goto :goto_1e

    :cond_3c
    move-object/from16 v1, v26

    move-object/from16 v26, v25

    invoke-static {v12, v8, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v25

    sget-object v2, Lwn/o;->f0:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v8

    sget-object v2, Lwn/o;->g0:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, Lwn/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v37

    if-nez v33, :cond_3d

    const/16 v34, 0x0

    goto :goto_1f

    :cond_3d
    if-eqz v79, :cond_3e

    move-object/from16 v34, v79

    goto :goto_1f

    :cond_3e
    invoke-static/range {v52 .. v53}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v34, v2

    :goto_1f
    if-nez v24, :cond_40

    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_40

    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v2

    move/from16 v6, v45

    new-array v12, v6, [Lvm/b;

    invoke-interface {v2, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lvm/b;

    new-instance v6, Lvm/c;

    const/4 v12, 0x1

    invoke-direct {v6, v13, v12, v2}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    if-nez v1, :cond_3f

    invoke-static {v13, v2}, Lwn/o;->b(Ljava/lang/String;[Lvm/b;)Lvm/c;

    move-result-object v1

    :cond_3f
    move-object/from16 v32, v6

    goto :goto_20

    :cond_40
    move-object/from16 v32, v24

    :goto_20
    cmp-long v2, v8, v74

    if-eqz v2, :cond_41

    cmp-long v6, v37, v74

    if-eqz v6, :cond_43

    :cond_41
    new-instance v24, Lwn/e;

    if-eqz v2, :cond_42

    move-wide/from16 v35, v8

    goto :goto_21

    :cond_42
    move-wide/from16 v35, v72

    :goto_21
    const/16 v40, 0x0

    const/16 v41, 0x1

    move-wide/from16 v30, v27

    const-wide/16 v27, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v24 .. v41}, Lwn/e;-><init>(Ljava/lang/String;Lwn/g;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-wide/from16 v27, v30

    move-object/from16 v11, v24

    :cond_43
    move-object v7, v0

    move-object/from16 v60, v13

    move-object/from16 v25, v26

    move-object/from16 v24, v32

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    move-object/from16 v6, v82

    const/16 v45, 0x0

    move-object/from16 v0, p0

    move-object/from16 v26, v1

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_44
    move-object/from16 v1, v26

    move-object/from16 v26, v25

    const-string v6, "#EXT-X-PART"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4e

    if-nez v33, :cond_45

    const/16 v34, 0x0

    goto :goto_22

    :cond_45
    if-eqz v79, :cond_46

    move-object/from16 v34, v79

    goto :goto_22

    :cond_46
    invoke-static/range {v52 .. v53}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v37

    move-object/from16 v34, v37

    :goto_22
    invoke-static {v12, v8, v3}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v25

    sget-object v6, Lwn/o;->N:Ljava/util/regex/Pattern;

    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v12, v6, v8}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v35

    mul-double v6, v35, v31

    double-to-long v6, v6

    sget-object v8, Lwn/o;->w0:Ljava/util/regex/Pattern;

    invoke-static {v12, v8}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v8

    if-eqz v23, :cond_47

    invoke-interface/range {v82 .. v82}, Ljava/util/List;->isEmpty()Z

    move-result v31

    if-eqz v31, :cond_47

    const/16 v31, 0x1

    goto :goto_23

    :cond_47
    const/16 v31, 0x0

    :goto_23
    or-int v40, v8, v31

    sget-object v8, Lwn/o;->x0:Ljava/util/regex/Pattern;

    invoke-static {v12, v8}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v39

    const/4 v8, 0x0

    invoke-static {v12, v9, v8, v3}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_49

    sget v12, Llo/y;->a:I

    const/4 v12, -0x1

    invoke-virtual {v9, v2, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    const/16 v45, 0x0

    aget-object v9, v2, v45

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v30

    array-length v9, v2

    const/4 v12, 0x1

    if-le v9, v12, :cond_48

    aget-object v2, v2, v12

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v68

    :cond_48
    move-wide/from16 v37, v30

    goto :goto_24

    :cond_49
    move-wide/from16 v37, v74

    :goto_24
    cmp-long v2, v37, v74

    if-nez v2, :cond_4a

    move-wide/from16 v35, v72

    goto :goto_25

    :cond_4a
    move-wide/from16 v35, v68

    :goto_25
    if-nez v24, :cond_4c

    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_4c

    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v9

    const/4 v12, 0x0

    new-array v8, v12, [Lvm/b;

    invoke-interface {v9, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lvm/b;

    new-instance v9, Lvm/c;

    const/4 v12, 0x1

    invoke-direct {v9, v13, v12, v8}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    if-nez v1, :cond_4b

    invoke-static {v13, v8}, Lwn/o;->b(Ljava/lang/String;[Lvm/b;)Lvm/c;

    move-result-object v1

    :cond_4b
    move-object/from16 v32, v9

    goto :goto_26

    :cond_4c
    move-object/from16 v32, v24

    :goto_26
    new-instance v24, Lwn/e;

    const/16 v41, 0x0

    move-wide/from16 v30, v27

    move-wide/from16 v27, v6

    invoke-direct/range {v24 .. v41}, Lwn/e;-><init>(Ljava/lang/String;Lwn/g;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v8, v24

    move-object/from16 v6, v26

    move-object/from16 v7, v82

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v27, v30, v27

    if-eqz v2, :cond_4d

    add-long v35, v35, v37

    :cond_4d
    move-wide/from16 v68, v35

    move-object/from16 v26, v1

    move-object/from16 v25, v6

    move-object v6, v7

    move-object/from16 v60, v13

    move-object/from16 v24, v32

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    const/16 v45, 0x0

    move-object/from16 v1, p1

    :goto_27
    move-object v7, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_4e
    move-object/from16 v6, v26

    move-wide/from16 v30, v27

    move-object/from16 v7, v82

    const-string v2, "#"

    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_57

    if-nez v33, :cond_4f

    const/16 v37, 0x0

    goto :goto_28

    :cond_4f
    if-eqz v79, :cond_50

    move-object/from16 v37, v79

    goto :goto_28

    :cond_50
    invoke-static/range {v52 .. v53}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v37

    :goto_28
    add-long v8, v52, v35

    invoke-static {v12, v3}, Lwn/o;->l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lwn/g;

    cmp-long v60, v50, v74

    if-nez v60, :cond_51

    move-object/from16 v25, v12

    move-wide/from16 v56, v72

    goto :goto_29

    :cond_51
    if-eqz v63, :cond_52

    if-nez v6, :cond_52

    if-nez v12, :cond_52

    new-instance v52, Lwn/g;

    const/16 v58, 0x0

    const/16 v59, 0x0

    const-wide/16 v54, 0x0

    move-object/from16 v53, v2

    invoke-direct/range {v52 .. v59}, Lwn/g;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v12, v52

    invoke-virtual {v4, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_52
    move-object/from16 v25, v12

    :goto_29
    if-nez v24, :cond_54

    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_54

    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v12

    move-object/from16 v26, v1

    move-object/from16 v53, v2

    const/4 v1, 0x0

    new-array v2, v1, [Lvm/b;

    invoke-interface {v12, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lvm/b;

    new-instance v12, Lvm/c;

    const/4 v1, 0x1

    invoke-direct {v12, v13, v1, v2}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    if-nez v26, :cond_53

    invoke-static {v13, v2}, Lwn/o;->b(Ljava/lang/String;[Lvm/b;)Lvm/c;

    move-result-object v1

    move-object/from16 v24, v12

    goto :goto_2b

    :cond_53
    move-object/from16 v24, v12

    :goto_2a
    move-object/from16 v1, v26

    goto :goto_2b

    :cond_54
    move-object/from16 v26, v1

    move-object/from16 v53, v2

    goto :goto_2a

    :goto_2b
    new-instance v2, Lwn/g;

    if-eqz v6, :cond_55

    move-object/from16 v26, v6

    :goto_2c
    move-object/from16 v41, v7

    move/from16 v30, v29

    move-object/from16 v34, v33

    move-object/from16 v35, v37

    move-wide/from16 v38, v50

    move-object/from16 v25, v53

    move-wide/from16 v36, v56

    move-wide/from16 v31, v61

    move/from16 v40, v64

    move-wide/from16 v28, v65

    move-object/from16 v27, v67

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    goto :goto_2d

    :cond_55
    move-object/from16 v26, v25

    goto :goto_2c

    :goto_2d
    invoke-direct/range {v24 .. v41}, Lwn/g;-><init>(Ljava/lang/String;Lwn/g;Ljava/lang/String;JIJLvm/c;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object/from16 v2, v24

    move-wide/from16 v65, v28

    move/from16 v29, v30

    move-wide/from16 v61, v31

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-long v27, v61, v65

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz v60, :cond_56

    add-long v56, v36, v38

    goto :goto_2e

    :cond_56
    move-wide/from16 v56, v36

    :goto_2e
    move-object v7, v0

    move-object/from16 v26, v1

    move-object/from16 v25, v6

    move-wide/from16 v52, v8

    move-object/from16 v60, v13

    move-object/from16 v67, v14

    move-wide/from16 v61, v27

    move-object/from16 v24, v33

    move-object/from16 v33, v34

    move-wide/from16 v65, v72

    move-wide/from16 v50, v74

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    const/16 v45, 0x0

    const/16 v64, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v6, v2

    goto/16 :goto_1

    :cond_57
    move-object/from16 v26, v1

    move-object/from16 v34, v33

    move-wide/from16 v38, v50

    move/from16 v40, v64

    move-object/from16 v27, v67

    :goto_2f
    move-object/from16 v1, p1

    move-object/from16 v25, v6

    move-object v6, v7

    move-object/from16 v60, v13

    move-object/from16 v67, v27

    move-wide/from16 v27, v30

    move-object/from16 v33, v34

    move-wide/from16 v50, v38

    move/from16 v64, v40

    move/from16 v2, v77

    move-object/from16 v9, v78

    move-object/from16 v37, v79

    move-object/from16 v8, v80

    const/16 v45, 0x0

    goto/16 :goto_27

    :cond_58
    move/from16 v77, v2

    move-object v0, v7

    move-object/from16 v80, v8

    move-object/from16 v78, v9

    move-object v7, v6

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v6, 0x0

    :goto_30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v6, v2, :cond_5c

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/f;

    iget-wide v3, v2, Lwn/f;->b:J

    cmp-long v8, v3, v74

    if-nez v8, :cond_59

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    int-to-long v3, v3

    add-long v3, v16, v3

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    int-to-long v8, v8

    sub-long/2addr v3, v8

    :cond_59
    iget v8, v2, Lwn/f;->c:I

    const/4 v12, -0x1

    if-ne v8, v12, :cond_5b

    cmp-long v9, v21, v70

    if-eqz v9, :cond_5b

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5a

    invoke-static {v5}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwn/g;

    iget-object v8, v8, Lwn/g;->M:Lzr/g0;

    goto :goto_31

    :cond_5a
    move-object v8, v7

    :goto_31
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const/16 v76, 0x1

    add-int/lit8 v8, v8, -0x1

    goto :goto_32

    :cond_5b
    const/16 v76, 0x1

    :goto_32
    iget-object v2, v2, Lwn/f;->a:Landroid/net/Uri;

    new-instance v9, Lwn/f;

    invoke-direct {v9, v2, v3, v4, v8}, Lwn/f;-><init>(Landroid/net/Uri;JI)V

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_30

    :cond_5c
    const/16 v76, 0x1

    if-eqz v11, :cond_5d

    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5d
    move-object/from16 v27, v5

    new-instance v5, Lwn/j;

    cmp-long v0, v48, v72

    if-eqz v0, :cond_5e

    move/from16 v25, v76

    :goto_33
    move-object/from16 v30, v1

    move-object/from16 v28, v7

    move v6, v15

    move-wide/from16 v9, v42

    move/from16 v24, v44

    move/from16 v14, v46

    move/from16 v15, v47

    move-wide/from16 v12, v48

    move/from16 v11, v77

    move-object/from16 v29, v78

    move-object/from16 v8, v80

    move-object/from16 v7, p3

    goto :goto_34

    :cond_5e
    const/16 v25, 0x0

    goto :goto_33

    :goto_34
    invoke-direct/range {v5 .. v30}, Lwn/j;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLvm/c;Ljava/util/List;Ljava/util/List;Lwn/i;Ljava/util/Map;)V

    return-object v5
.end method

.method public static f(Lq30/w0;Ljava/lang/String;)Lwn/m;
    .locals 36

    move-object/from16 v1, p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lq30/w0;->w()Z

    move-result v14

    const-string v15, "application/x-mpegURL"

    const/16 v16, 0x0

    sget-object v9, Lwn/o;->k0:Ljava/util/regex/Pattern;

    move-object/from16 v17, v7

    sget-object v7, Lwn/o;->p0:Ljava/util/regex/Pattern;

    move/from16 v18, v10

    if-eqz v14, :cond_12

    invoke-virtual/range {p0 .. p0}, Lq30/w0;->z()Ljava/lang/String;

    move-result-object v14

    const-string v10, "#EXT"

    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v10, "#EXT-X-I-FRAME-STREAM-INF"

    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    move-object/from16 v21, v8

    const-string v8, "#EXT-X-DEFINE"

    invoke-virtual {v14, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-static {v14, v7, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lwn/o;->z0:Ljava/util/regex/Pattern;

    invoke-static {v14, v8, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v11, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :cond_1
    const-string v7, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v33, v5

    move-object/from16 v32, v6

    move-object/from16 v30, v12

    move/from16 v10, v18

    const/4 v13, 0x1

    goto/16 :goto_e

    :cond_2
    const-string v7, "#EXT-X-MEDIA"

    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    const-string v7, "#EXT-X-SESSION-KEY"

    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    sget-object v7, Lwn/o;->i0:Ljava/util/regex/Pattern;

    const-string v8, "identity"

    invoke-static {v14, v7, v8, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v14, v7, v11}, Lwn/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lvm/b;

    move-result-object v7

    if-eqz v7, :cond_7

    sget-object v8, Lwn/o;->h0:Ljava/util/regex/Pattern;

    invoke-static {v14, v8, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "SAMPLE-AES-CENC"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    const-string v9, "SAMPLE-AES-CTR"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_1

    :cond_4
    const-string v8, "cbcs"

    goto :goto_2

    :cond_5
    :goto_1
    const-string v8, "cenc"

    :goto_2
    new-instance v9, Lvm/c;

    filled-new-array {v7}, [Lvm/b;

    move-result-object v7

    const/4 v10, 0x1

    invoke-direct {v9, v8, v10, v7}, Lvm/c;-><init>(Ljava/lang/String;Z[Lvm/b;)V

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    const-string v7, "#EXT-X-STREAM-INF"

    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_8

    if-eqz v10, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v33, v5

    move-object/from16 v32, v6

    move-object/from16 v30, v12

    move/from16 v10, v18

    goto/16 :goto_e

    :cond_8
    :goto_4
    const-string v7, "CLOSED-CAPTIONS=NONE"

    invoke-virtual {v14, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    or-int v7, v18, v7

    if-eqz v10, :cond_9

    const/16 v8, 0x4000

    :goto_5
    move/from16 v18, v7

    goto :goto_6

    :cond_9
    move/from16 v8, v16

    goto :goto_5

    :goto_6
    sget-object v7, Lwn/o;->H:Ljava/util/regex/Pattern;

    move/from16 v22, v10

    sget-object v10, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v14, v7, v10}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    sget-object v10, Lwn/o;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v10, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v23

    if-eqz v23, :cond_a

    move-object/from16 v30, v12

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    goto :goto_7

    :cond_a
    move-object/from16 v30, v12

    const/4 v10, -0x1

    :goto_7
    sget-object v12, Lwn/o;->J:Ljava/util/regex/Pattern;

    move/from16 v31, v13

    const/4 v13, 0x0

    invoke-static {v14, v12, v13, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v32, v6

    sget-object v6, Lwn/o;->K:Ljava/util/regex/Pattern;

    invoke-static {v14, v6, v13, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_d

    sget v13, Llo/y;->a:I

    const-string v13, "x"

    move-object/from16 v33, v5

    const/4 v5, -0x1

    invoke-virtual {v6, v13, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    aget-object v5, v6, v16

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/16 v20, 0x1

    aget-object v6, v6, v20

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-lez v5, :cond_c

    if-gtz v6, :cond_b

    goto :goto_8

    :cond_b
    move/from16 v19, v5

    goto :goto_9

    :cond_c
    :goto_8
    const/4 v6, -0x1

    const/16 v19, -0x1

    :goto_9
    move/from16 v5, v19

    goto :goto_a

    :cond_d
    move-object/from16 v33, v5

    const/4 v5, -0x1

    const/4 v6, -0x1

    :goto_a
    sget-object v13, Lwn/o;->L:Ljava/util/regex/Pattern;

    move-object/from16 v34, v4

    const/4 v4, 0x0

    invoke-static {v14, v13, v4, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_e

    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v13

    :goto_b
    move-object/from16 v35, v3

    goto :goto_c

    :cond_e
    const/high16 v13, -0x40800000    # -1.0f

    goto :goto_b

    :goto_c
    sget-object v3, Lwn/o;->z:Ljava/util/regex/Pattern;

    invoke-static {v14, v3, v4, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v24

    sget-object v3, Lwn/o;->E:Ljava/util/regex/Pattern;

    invoke-static {v14, v3, v4, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v25

    sget-object v3, Lwn/o;->F:Ljava/util/regex/Pattern;

    invoke-static {v14, v3, v4, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v28

    sget-object v3, Lwn/o;->G:Ljava/util/regex/Pattern;

    invoke-static {v14, v3, v4, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v29

    if-eqz v22, :cond_f

    invoke-static {v14, v9, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_d

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lq30/w0;->w()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual/range {p0 .. p0}, Lq30/w0;->z()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v11}, Lwn/o;->l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    :goto_d
    new-instance v4, Lrm/b0;

    invoke-direct {v4}, Lrm/b0;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lrm/b0;->a:Ljava/lang/String;

    iput-object v15, v4, Lrm/b0;->j:Ljava/lang/String;

    iput-object v12, v4, Lrm/b0;->h:Ljava/lang/String;

    iput v10, v4, Lrm/b0;->f:I

    iput v7, v4, Lrm/b0;->g:I

    iput v5, v4, Lrm/b0;->p:I

    iput v6, v4, Lrm/b0;->q:I

    iput v13, v4, Lrm/b0;->r:F

    iput v8, v4, Lrm/b0;->e:I

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v4}, Lrm/c0;-><init>(Lrm/b0;)V

    new-instance v23, Lwn/l;

    move-object/from16 v26, v24

    move-object/from16 v27, v25

    move-object/from16 v24, v3

    move-object/from16 v25, v5

    invoke-direct/range {v23 .. v29}, Lwn/l;-><init>(Landroid/net/Uri;Lrm/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v23

    move-object/from16 v24, v26

    move-object/from16 v25, v27

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_10

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    new-instance v23, Lvn/s;

    move/from16 v27, v7

    move/from16 v26, v10

    invoke-direct/range {v23 .. v29}, Lvn/s;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, v23

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v10, v18

    move/from16 v13, v31

    :goto_e
    move-object/from16 v7, v17

    move-object/from16 v8, v21

    move-object/from16 v12, v30

    move-object/from16 v6, v32

    move-object/from16 v5, v33

    move-object/from16 v4, v34

    move-object/from16 v3, v35

    goto/16 :goto_0

    :cond_11
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    invoke-static {v0}, Lcom/google/android/exoplayer2/ParserException;->b(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_12
    move-object/from16 v35, v3

    move-object/from16 v34, v4

    move-object/from16 v33, v5

    move-object/from16 v32, v6

    move-object/from16 v21, v8

    move-object/from16 v30, v12

    move/from16 v31, v13

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    move/from16 v5, v16

    :goto_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_15

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwn/l;

    iget-object v8, v6, Lwn/l;->a:Landroid/net/Uri;

    iget-object v10, v6, Lwn/l;->b:Lrm/c0;

    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    iget-object v8, v10, Lrm/c0;->J:Lin/c;

    if-nez v8, :cond_13

    const/4 v8, 0x1

    goto :goto_10

    :cond_13
    move/from16 v8, v16

    :goto_10
    invoke-static {v8}, Llo/a;->i(Z)V

    new-instance v8, Lvn/t;

    iget-object v12, v6, Lwn/l;->a:Landroid/net/Uri;

    invoke-virtual {v0, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v13, 0x0

    invoke-direct {v8, v13, v13, v12}, Lvn/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v12, Lin/c;

    const/4 v13, 0x1

    new-array v14, v13, [Lin/b;

    aput-object v8, v14, v16

    invoke-direct {v12, v14}, Lin/c;-><init>([Lin/b;)V

    invoke-virtual {v10}, Lrm/c0;->a()Lrm/b0;

    move-result-object v8

    iput-object v12, v8, Lrm/b0;->i:Lin/c;

    new-instance v10, Lrm/c0;

    invoke-direct {v10, v8}, Lrm/c0;-><init>(Lrm/b0;)V

    new-instance v22, Lwn/l;

    iget-object v8, v6, Lwn/l;->a:Landroid/net/Uri;

    iget-object v12, v6, Lwn/l;->c:Ljava/lang/String;

    iget-object v13, v6, Lwn/l;->d:Ljava/lang/String;

    iget-object v14, v6, Lwn/l;->e:Ljava/lang/String;

    iget-object v6, v6, Lwn/l;->f:Ljava/lang/String;

    move-object/from16 v28, v6

    move-object/from16 v23, v8

    move-object/from16 v24, v10

    move-object/from16 v25, v12

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    invoke-direct/range {v22 .. v28}, Lwn/l;-><init>(Landroid/net/Uri;Lrm/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v6, v22

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_15
    move/from16 v0, v16

    const/4 v8, 0x0

    const/4 v13, 0x0

    :goto_11
    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_33

    move-object/from16 v4, v35

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v6, Lwn/o;->q0:Ljava/util/regex/Pattern;

    invoke-static {v5, v6, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v7, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    new-instance v12, Lrm/b0;

    invoke-direct {v12}, Lrm/b0;-><init>()V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    const/16 v20, 0x1

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v22

    add-int v14, v22, v14

    move/from16 v22, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ":"

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v12, Lrm/b0;->a:Ljava/lang/String;

    iput-object v10, v12, Lrm/b0;->b:Ljava/lang/String;

    iput-object v15, v12, Lrm/b0;->j:Ljava/lang/String;

    sget-object v0, Lwn/o;->u0:Ljava/util/regex/Pattern;

    invoke-static {v5, v0}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v0

    sget-object v14, Lwn/o;->v0:Ljava/util/regex/Pattern;

    invoke-static {v5, v14}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v14

    if-eqz v14, :cond_16

    or-int/lit8 v0, v0, 0x2

    :cond_16
    sget-object v14, Lwn/o;->t0:Ljava/util/regex/Pattern;

    invoke-static {v5, v14}, Lwn/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v14

    if-eqz v14, :cond_17

    or-int/lit8 v0, v0, 0x4

    :cond_17
    iput v0, v12, Lrm/b0;->d:I

    sget-object v0, Lwn/o;->r0:Ljava/util/regex/Pattern;

    const/4 v14, 0x0

    invoke-static {v5, v0, v14, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_18

    move-object/from16 p0, v3

    move/from16 v14, v16

    goto :goto_13

    :cond_18
    sget v14, Llo/y;->a:I

    const-string v14, ","

    move-object/from16 p0, v3

    const/4 v3, -0x1

    invoke-virtual {v0, v14, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const-string v14, "public.accessibility.describes-video"

    invoke-static {v0, v14}, Llo/y;->j([Ljava/lang/Object;Ljava/lang/Comparable;)Z

    move-result v14

    if-eqz v14, :cond_19

    const/16 v14, 0x200

    goto :goto_12

    :cond_19
    move/from16 v14, v16

    :goto_12
    const-string v3, "public.accessibility.transcribes-spoken-dialog"

    invoke-static {v0, v3}, Llo/y;->j([Ljava/lang/Object;Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_1a

    or-int/lit16 v14, v14, 0x1000

    :cond_1a
    const-string v3, "public.accessibility.describes-music-and-sound"

    invoke-static {v0, v3}, Llo/y;->j([Ljava/lang/Object;Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_1b

    or-int/lit16 v14, v14, 0x400

    :cond_1b
    const-string v3, "public.easy-to-read"

    invoke-static {v0, v3}, Llo/y;->j([Ljava/lang/Object;Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1c

    or-int/lit16 v14, v14, 0x2000

    :cond_1c
    :goto_13
    iput v14, v12, Lrm/b0;->e:I

    sget-object v0, Lwn/o;->o0:Ljava/util/regex/Pattern;

    const/4 v14, 0x0

    invoke-static {v5, v0, v14, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v12, Lrm/b0;->c:Ljava/lang/String;

    invoke-static {v5, v9, v14, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1d

    const/4 v0, 0x0

    goto :goto_14

    :cond_1d
    invoke-static {v1, v0}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_14
    new-instance v3, Lin/c;

    new-instance v14, Lvn/t;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v14, v6, v10, v1}, Lvn/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v35, v4

    const/4 v1, 0x1

    new-array v4, v1, [Lin/b;

    aput-object v14, v4, v16

    invoke-direct {v3, v4}, Lin/c;-><init>([Lin/b;)V

    sget-object v1, Lwn/o;->m0:Ljava/util/regex/Pattern;

    invoke-static {v5, v1, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v14, 0x2

    sparse-switch v4, :sswitch_data_0

    :goto_15
    const/4 v1, -0x1

    goto :goto_16

    :sswitch_0
    const-string v4, "VIDEO"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto :goto_15

    :cond_1e
    const/4 v1, 0x3

    goto :goto_16

    :sswitch_1
    const-string v4, "AUDIO"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto :goto_15

    :cond_1f
    move v1, v14

    goto :goto_16

    :sswitch_2
    const-string v4, "CLOSED-CAPTIONS"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto :goto_15

    :cond_20
    const/4 v1, 0x1

    goto :goto_16

    :sswitch_3
    const-string v4, "SUBTITLES"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto :goto_15

    :cond_21
    move/from16 v1, v16

    :goto_16
    packed-switch v1, :pswitch_data_0

    :goto_17
    move-object/from16 v6, v32

    move-object/from16 v4, v33

    goto/16 :goto_1e

    :pswitch_0
    move/from16 v1, v16

    :goto_18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_23

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/l;

    iget-object v5, v4, Lwn/l;->c:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_22

    goto :goto_19

    :cond_22
    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_23
    const/4 v4, 0x0

    :goto_19
    if-eqz v4, :cond_24

    iget-object v1, v4, Lwn/l;->b:Lrm/c0;

    iget-object v4, v1, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v14, v4}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v12, Lrm/b0;->h:Ljava/lang/String;

    invoke-static {v4}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v12, Lrm/b0;->k:Ljava/lang/String;

    iget v4, v1, Lrm/c0;->Q:I

    iput v4, v12, Lrm/b0;->p:I

    iget v4, v1, Lrm/c0;->R:I

    iput v4, v12, Lrm/b0;->q:I

    iget v1, v1, Lrm/c0;->S:F

    iput v1, v12, Lrm/b0;->r:F

    :cond_24
    if-nez v0, :cond_25

    goto :goto_17

    :cond_25
    iput-object v3, v12, Lrm/b0;->i:Lin/c;

    new-instance v1, Lwn/k;

    new-instance v3, Lrm/c0;

    invoke-direct {v3, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-direct {v1, v0, v3, v10}, Lwn/k;-><init>(Landroid/net/Uri;Lrm/c0;Ljava/lang/String;)V

    move-object/from16 v4, v34

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :pswitch_1
    move-object/from16 v4, v34

    move/from16 v1, v16

    :goto_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v1, v14, :cond_27

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwn/l;

    move/from16 v23, v1

    iget-object v1, v14, Lwn/l;->d:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_1b

    :cond_26
    add-int/lit8 v1, v23, 0x1

    goto :goto_1a

    :cond_27
    const/4 v14, 0x0

    :goto_1b
    if-eqz v14, :cond_28

    iget-object v1, v14, Lwn/l;->b:Lrm/c0;

    iget-object v1, v1, Lrm/c0;->I:Ljava/lang/String;

    const/4 v6, 0x1

    invoke-static {v6, v1}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v12, Lrm/b0;->h:Ljava/lang/String;

    invoke-static {v1}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1c

    :cond_28
    const/4 v1, 0x0

    :goto_1c
    sget-object v6, Lwn/o;->I:Ljava/util/regex/Pattern;

    move-object/from16 v34, v4

    const/4 v4, 0x0

    invoke-static {v5, v6, v4, v11}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_29

    sget v6, Llo/y;->a:I

    const-string v6, "/"

    const/4 v4, 0x2

    invoke-virtual {v5, v6, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v16

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v12, Lrm/b0;->x:I

    const-string v4, "audio/eac3"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    const-string v4, "/JOC"

    invoke-virtual {v5, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_29

    const-string v1, "ec+3"

    iput-object v1, v12, Lrm/b0;->h:Ljava/lang/String;

    const-string v1, "audio/eac3-joc"

    :cond_29
    iput-object v1, v12, Lrm/b0;->k:Ljava/lang/String;

    if-eqz v0, :cond_2a

    iput-object v3, v12, Lrm/b0;->i:Lin/c;

    new-instance v1, Lwn/k;

    new-instance v3, Lrm/c0;

    invoke-direct {v3, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-direct {v1, v0, v3, v10}, Lwn/k;-><init>(Landroid/net/Uri;Lrm/c0;Ljava/lang/String;)V

    move-object/from16 v4, v33

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_2a
    move-object/from16 v4, v33

    if-eqz v14, :cond_2b

    new-instance v0, Lrm/c0;

    invoke-direct {v0, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    move-object v8, v0

    :cond_2b
    :goto_1d
    move-object/from16 v6, v32

    :goto_1e
    const/16 v20, 0x1

    goto/16 :goto_23

    :pswitch_2
    move-object/from16 v4, v33

    sget-object v0, Lwn/o;->s0:Ljava/util/regex/Pattern;

    invoke-static {v5, v0, v11}, Lwn/o;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "CC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "application/cea-608"

    goto :goto_1f

    :cond_2c
    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "application/cea-708"

    :goto_1f
    if-nez v13, :cond_2d

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :cond_2d
    iput-object v1, v12, Lrm/b0;->k:Ljava/lang/String;

    iput v0, v12, Lrm/b0;->C:I

    new-instance v0, Lrm/c0;

    invoke-direct {v0, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :pswitch_3
    move-object/from16 v4, v33

    const/16 v20, 0x1

    move/from16 v1, v16

    :goto_20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v1, v5, :cond_2f

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwn/l;

    iget-object v14, v5, Lwn/l;->e:Ljava/lang/String;

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2e

    goto :goto_21

    :cond_2e
    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    :cond_2f
    const/4 v5, 0x0

    :goto_21
    if-eqz v5, :cond_30

    iget-object v1, v5, Lwn/l;->b:Lrm/c0;

    iget-object v1, v1, Lrm/c0;->I:Ljava/lang/String;

    const/4 v5, 0x3

    invoke-static {v5, v1}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v12, Lrm/b0;->h:Ljava/lang/String;

    invoke-static {v1}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_22

    :cond_30
    const/4 v1, 0x0

    :goto_22
    if-nez v1, :cond_31

    const-string v1, "text/vtt"

    :cond_31
    iput-object v1, v12, Lrm/b0;->k:Ljava/lang/String;

    iput-object v3, v12, Lrm/b0;->i:Lin/c;

    if-eqz v0, :cond_32

    new-instance v1, Lwn/k;

    new-instance v3, Lrm/c0;

    invoke-direct {v3, v12}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-direct {v1, v0, v3, v10}, Lwn/k;-><init>(Landroid/net/Uri;Lrm/c0;Ljava/lang/String;)V

    move-object/from16 v6, v32

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_32
    move-object/from16 v6, v32

    const-string v0, "HlsPlaylistParser"

    const-string v1, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_23
    add-int/lit8 v0, v22, 0x1

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v33, v4

    move-object/from16 v32, v6

    goto/16 :goto_11

    :cond_33
    move-object/from16 p0, v3

    move-object/from16 v6, v32

    move-object/from16 v4, v33

    if-eqz v18, :cond_34

    sget-object v13, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_34
    move-object v9, v13

    new-instance v0, Lwn/m;

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object v5, v4

    move-object/from16 v7, v17

    move-object/from16 v2, v21

    move-object/from16 v12, v30

    move/from16 v10, v31

    move-object/from16 v4, v34

    invoke-direct/range {v0 .. v12}, Lwn/m;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrm/c0;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Ljava/lang/String;Ljava/util/regex/Pattern;)Z
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "YES"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0

    :cond_0
    const-wide/high16 p0, -0x3c20000000000000L    # -9.223372036854776E18

    return-wide p0
.end method

.method public static i(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0

    :cond_0
    const-wide/16 p0, -0x1

    return-wide p0
.end method

.method public static j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2, p3}, Lwn/o;->l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method

.method public static k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lwn/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x13

    invoke-static {p2, p1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result p2

    invoke-static {p2, p0}, Lq63/c;->b(ILjava/lang/String;)I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Couldn\'t match "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/exoplayer2/ParserException;->b(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0
.end method

.method public static l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lwn/o;->B0:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/net/Uri;Lko/m;)Lwn/n;
    .locals 6

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    const/16 v2, 0xef

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    const/16 v2, 0xbb

    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    const/16 v2, 0xbf

    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    :cond_0
    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x7

    if-ge v3, v4, :cond_2

    const-string v4, "#EXTM3U"

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v1, v4, :cond_5

    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    const/16 v3, 0xd

    const/16 v4, 0xa

    if-eq v1, v2, :cond_4

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v5

    if-eqz v5, :cond_4

    sget v5, Llo/y;->a:I

    if-eq v1, v4, :cond_4

    if-ne v1, v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    goto :goto_2

    :cond_4
    :goto_3
    sget v2, Llo/y;->a:I

    if-eq v1, v4, :cond_6

    if-ne v1, v3, :cond_5

    goto :goto_4

    :cond_5
    const-string p1, "Input does not start with the #EXTM3U header."

    invoke-static {p1}, Lcom/google/android/exoplayer2/ParserException;->b(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    const-string v2, "#EXT-X-STREAM-INF"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    new-instance v1, Lq30/w0;

    invoke-direct {v1, p2, v0}, Lq30/w0;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lwn/o;->f(Lq30/w0;Ljava/lang/String;)Lwn/m;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget p2, Llo/y;->a:I

    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-object p1

    :cond_8
    :try_start_2
    const-string v2, "#EXT-X-TARGETDURATION"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXTINF"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-KEY"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-BYTERANGE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, "#EXT-X-ENDLIST"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    :goto_5
    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lwn/o;->w:Lwn/m;

    iget-object v2, p0, Lwn/o;->x:Lwn/j;

    new-instance v3, Lq30/w0;

    invoke-direct {v3, p2, v0}, Lq30/w0;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, v3, p1}, Lwn/o;->e(Lwn/m;Lwn/j;Lq30/w0;Ljava/lang/String;)Lwn/j;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget p2, Llo/y;->a:I

    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    return-object p1

    :cond_b
    sget p1, Llo/y;->a:I

    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    const-string p1, "Failed to parse the playlist, could not identify any tags."

    invoke-static {p1}, Lcom/google/android/exoplayer2/ParserException;->b(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :goto_6
    sget p2, Llo/y;->a:I

    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    throw p1
.end method
