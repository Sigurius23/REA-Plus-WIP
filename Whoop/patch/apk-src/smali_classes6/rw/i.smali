.class public final Lrw/i;
.super Low/z;
.source "SourceFile"


# static fields
.field public static final b:Lrw/h;


# instance fields
.field public final a:Low/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrw/i;

    sget-object v1, Low/x;->x:Low/u;

    invoke-direct {v0, v1}, Lrw/i;-><init>(Low/x;)V

    new-instance v1, Lrw/h;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lrw/h;-><init>(Ljava/lang/Object;I)V

    sput-object v1, Lrw/i;->b:Lrw/h;

    return-void
.end method

.method public constructor <init>(Low/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrw/i;->a:Low/x;

    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expecting number, got: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lvl/b;->B(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, Lrw/i;->a:Low/x;

    invoke-virtual {v0, p1}, Low/x;->a(Lww/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p1, p2}, Lww/b;->o0(Ljava/lang/Number;)V

    return-void
.end method
