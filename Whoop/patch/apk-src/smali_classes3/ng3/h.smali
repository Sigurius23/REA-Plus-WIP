.class public final enum Lng3/h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lng3/r;


# static fields
.field public static final synthetic x:[Lng3/h;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lng3/h;

    sget-object v1, Ljg3/b;->y:Ljg3/b;

    const-string v1, "WEEK_BASED_YEARS"

    const/4 v2, 0x0

    const-string v3, "WeekBasedYears"

    invoke-direct {v0, v1, v2, v3}, Lng3/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lng3/h;

    const/4 v2, 0x1

    const-string v3, "QuarterYears"

    const-string v4, "QUARTER_YEARS"

    invoke-direct {v1, v4, v2, v3}, Lng3/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1}, [Lng3/h;

    move-result-object v0

    sput-object v0, Lng3/h;->x:[Lng3/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lng3/h;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lng3/h;
    .locals 1

    const-class v0, Lng3/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lng3/h;

    return-object p0
.end method

.method public static values()[Lng3/h;
    .locals 1

    sget-object v0, Lng3/h;->x:[Lng3/h;

    invoke-virtual {v0}, [Lng3/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lng3/h;

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/j;J)Lng3/j;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x100

    div-long v2, p2, v0

    sget-object v4, Lng3/b;->F:Lng3/b;

    invoke-interface {p1, v2, v3, v4}, Lng3/j;->c(JLng3/r;)Lng3/j;

    move-result-object p1

    rem-long/2addr p2, v0

    const-wide/16 v0, 0x3

    mul-long/2addr p2, v0

    sget-object v0, Lng3/b;->E:Lng3/b;

    invoke-interface {p1, p2, p3, v0}, Lng3/j;->c(JLng3/r;)Lng3/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unreachable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget v0, Lng3/i;->a:I

    sget-object v0, Lng3/g;->z:Lng3/f;

    invoke-interface {p1, v0}, Lng3/k;->f(Lng3/m;)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2, p2, p3}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide p2

    invoke-interface {p1, p2, p3, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lng3/h;->w:Ljava/lang/String;

    return-object v0
.end method
