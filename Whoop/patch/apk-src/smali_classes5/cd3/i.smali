.class public abstract Lcd3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcd3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcd3/d;

    sget-object v1, Lm83/z;->w:Lm83/z;

    const/4 v6, 0x0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v6}, Lcd3/d;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V

    sput-object v0, Lcd3/i;->a:Lcd3/d;

    return-void
.end method

.method public static final a(Lcd3/f;Lcd3/f;)Lcd3/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd3/g;

    invoke-direct {v0}, Lcd3/g;-><init>()V

    invoke-virtual {p0, v0}, Lcd3/f;->a(Lcd3/h;)V

    new-instance p0, Laj/c;

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p0}, Lcd3/f;->a(Lcd3/h;)V

    invoke-virtual {v0}, Lcd3/g;->r()Lcd3/d;

    move-result-object p0

    return-object p0
.end method
