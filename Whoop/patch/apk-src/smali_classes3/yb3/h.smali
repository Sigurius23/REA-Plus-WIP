.class public final Lyb3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lyb3/h;


# instance fields
.field public final a:Z

.field public final b:Lyb3/f;

.field public final c:Lyb3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lyb3/h;

    sget-object v1, Lyb3/f;->d:Lyb3/f;

    sget-object v2, Lyb3/g;->a:Lyb3/g;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lyb3/h;-><init>(ZLyb3/f;Lyb3/g;)V

    sput-object v0, Lyb3/h;->d:Lyb3/h;

    new-instance v0, Lyb3/h;

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lyb3/h;-><init>(ZLyb3/f;Lyb3/g;)V

    return-void
.end method

.method public constructor <init>(ZLyb3/f;Lyb3/g;)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lyb3/h;->a:Z

    iput-object p2, p0, Lyb3/h;->b:Lyb3/f;

    iput-object p3, p0, Lyb3/h;->c:Lyb3/g;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const-string v0, "HexFormat(\n    upperCase = "

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lyb3/h;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n    bytes = BytesHexFormat(\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyb3/h;->b:Lyb3/f;

    const-string v2, "        "

    invoke-virtual {v1, v0, v2}, Lyb3/f;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, "    ),"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, "    number = NumberHexFormat("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lyb3/h;->c:Lyb3/g;

    invoke-virtual {v3, v0, v2}, Lyb3/g;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    )"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
