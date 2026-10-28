.class public final Li63/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li63/m;


# static fields
.field public static final c:Li63/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li63/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li63/f;->c:Li63/f;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final c(Lc93/m;)V
    .locals 0

    check-cast p1, Lb2/r;

    invoke-static {p0, p1}, Lwb3/f;->z(Lo63/m;Lc93/m;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Headers "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
