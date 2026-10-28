.class public final Lv93/c;
.super Lr93/m1;
.source "SourceFile"


# static fields
.field public static final c:Lv93/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv93/c;

    const-string v1, "protected_static"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr93/m1;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lv93/c;->c:Lv93/c;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "protected/*protected static*/"

    return-object v0
.end method

.method public final c()Lr93/m1;
    .locals 1

    sget-object v0, Lr93/i1;->c:Lr93/i1;

    return-object v0
.end method
