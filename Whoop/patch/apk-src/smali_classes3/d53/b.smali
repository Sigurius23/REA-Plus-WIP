.class public final Ld53/b;
.super Lq83/a;
.source "SourceFile"


# static fields
.field public static final x:Lu00/e;


# instance fields
.field public final w:Lec3/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu00/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lu00/e;-><init>(I)V

    sput-object v0, Ld53/b;->x:Lu00/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ld53/b;->x:Lu00/e;

    invoke-direct {p0, v0}, Lq83/a;-><init>(Lq83/i;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Ld53/b;->w:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ld53/b;->w:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "UserIdentifier("

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
