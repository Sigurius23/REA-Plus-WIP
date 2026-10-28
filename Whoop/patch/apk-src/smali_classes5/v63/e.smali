.class public final Lv63/e;
.super Lv63/g;
.source "SourceFile"


# static fields
.field public static final H:Lv63/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lv63/e;

    sget-object v1, Lw63/a;->m:Lw63/a;

    const-wide/16 v2, 0x0

    sget-object v4, Lw63/a;->l:Lio/ktor/utils/io/internal/e;

    invoke-direct {v0, v1, v2, v3, v4}, Lv63/e;-><init>(Lw63/a;JLx63/f;)V

    sput-object v0, Lv63/e;->H:Lv63/e;

    return-void
.end method

.method public constructor <init>(Lw63/a;JLx63/f;)V
    .locals 1

    const-string v0, "head"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pool"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lv63/g;-><init>(Lw63/a;JLx63/f;)V

    iget-boolean p1, p0, Lv63/g;->G:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv63/g;->G:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ByteReadPacket("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lv63/g;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes remaining)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
